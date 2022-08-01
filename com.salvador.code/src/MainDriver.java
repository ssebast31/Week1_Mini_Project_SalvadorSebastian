import java.util.Scanner;

public class MainDriver {
    public static void main(String[] args) {
        
        //create instance of scanner class and thermometer class
        Scanner sc = new Scanner(System.in);

        Thermometer thermometer1 = new Thermometer();

        
        //Prompt the user to name their Thermometer. Save the name to a new instance of your Thermometer class.
        System.out.print("Please enter the name of the thermomter: ");
        
        //save name in varible named name 
        String name= sc.nextLine();

        //print welcome message 
        System.out.println("Hi user, thanks for using "+ name +" today!");

        //prompt user to enter a Fahrenheit and Celsius value respectively.
        System.out.print("Please enter a Fahrenheit value: ");
        //save Fahrenheit value to variable tempF
        int tempF=sc.nextInt();

        System.out.print("Please enter a Celsius value: ");
        //save Celsius value 
        int tempC=sc.nextInt();

        //set values to the thermomter object 
        thermometer1.setName(name);
        thermometer1.setDegreesC(tempC);
        thermometer1.setDegreesF(tempF);

        //convert values 
         int convertFTOC = thermometer1.converToCelsius(tempF);
         int convertCTOF = thermometer1.convertToFahrenheit(tempC);

         //print results of conversions 
         System.out.println("Fahrenheit to Celsius: " + convertFTOC);
         System.out.println("Celsius to Fahrenheit: " + convertCTOF);


        /*
         * prompt the user to enter three integer values that represent recent temperature readings. 
         * Set this input as the Thermometer's tempReadings value.
         */

        System.out.print("please enter the first most recent temperature reading: ");
        int first=sc.nextInt();


        System.out.print("please enter the second most recent temperature reading: ");
        int second= sc.nextInt();


        System.out.print("please enter the third most recent temperature reading: ");
        int third=sc.nextInt();


        //store reading in array
        int[] array1={first,second,third};

        thermometer1.setTempReadings(array1);


        //Call the Thermometer's calculateAvgTemp() method to print the average temperature.
        Thermometer.calculateAvgTemp(array1);


        //Print a goodbye message to the user to let the user know that the app is closing.
        System.out.println("Goodbye the app will now be closing. See you next time!");







        
    }
}