import java.util.Arrays;

public class Thermometer {
    //declare variables 
    private int degreesF;
    private int degreesC;
    private String name;
    private int[] tempReadings= new int[3];
    
    
    
    //constructor with args 
    public Thermometer(int degreesF, int degreesC, String name, int[] tempReadings) {
        this.degreesF = degreesF;
        this.degreesC = degreesC;
        this.name = name;
        this.tempReadings = tempReadings;
    }


    //constructor no args 
    public Thermometer() {
    }


    //getters and setters
    public int getDegreesF() {
        return degreesF;
    }


    public void setDegreesF(int degreesF) {
        this.degreesF = degreesF;
    }


    public int getDegreesC() {
        return degreesC;
    }


    public void setDegreesC(int degreesC) {
        this.degreesC = degreesC;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int[] getTempReadings() {
        return tempReadings;
    }


    public void setTempReadings(int[] tempReadings) {
        this.tempReadings = tempReadings;
    }

    //overide to_string

    @Override
    public String toString() {
        return "Thermometer [degreesC=" + degreesC + ", degreesF=" + degreesF + ", name=" + name + ", tempReadings="
                + Arrays.toString(tempReadings) + "]";
    }

    //custom methods
    public static int convertToFahrenheit(int c)
    {
        double tempConverted = (c *(9.0/5.0)+32);
        
        return (int)tempConverted;

    }

    public static int converToCelsius(int f)
    {

        double tempConvertedC = (f-32)*(5.0/9.0);
        
        return (int)tempConvertedC;
    }

    public static void calculateAvgTemp(int[] temps)
    {
        
        double sum=0;
        
        for(int i=0; i<temps.length;i++)
        {
            sum+=temps[i];
        }

        double avg= sum/temps.length;

        System.out.printf("Avg=" +" %.2f\n", avg);

        //System.out.println("Avg = " + avg);
    }

    

    

    

    


    
}
