import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Test harness for the ClimateUtilities class
 *
 * @author Kathryn Merrick
 *
 * @version 24/2/2015
 *
 */
public class ClimateUtilitiesTestHarness {
	Scanner scan = new Scanner(System.in);
    /**
     * Method to test the convertToCelsius(.) method of ClimateUtilities.
     */
    public void testConvertToCelsius() {
        System.out.println("Starting test of ClimateUtilities."
                + "ConvertToCelsius(.) method");
        for (int temp = 10; temp < 100; temp++) {
            System.out.println(" Testing input " + temp
                    + ": ouput is: " + ClimateUtilities.convertToCelsius(temp));
        }
        System.out.println("Finished testing ClimateUtilities."
                + "ConvertToCelsius(.) method");
    }

    /**
     * Method to test the convertToFahrenheit(.) method of ClimateUtilities.
     */
    public void testConvertToFahrenheit() {
    	double temp;
    	
    	System.out.println("Starting test of ClimateUtilities.ConvertToFahrenheit(.) method");
    	temp = 15;
    	System.out.println("Testing input " + temp + ": output is: " + ClimateUtilities.convertToFahrenheit(temp));

    	temp = -15;
    	System.out.println("Testing input " + temp + ": output is: " + ClimateUtilities.convertToFahrenheit(temp));

    	temp = 0;
    	System.out.println("Testing input " + temp + ": output is: " + ClimateUtilities.convertToFahrenheit(temp));
    	
    	try {
        	System.out.println("Testing input ");
        	temp = scan.nextDouble();
        	System.out.println(": output is: " + ClimateUtilities.convertToFahrenheit(temp));
    	}catch(InputMismatchException e) {
    		System.out.println("Unexpected input");
    		scan.nextLine();
    	}
    	
    	System.out.println("Finished test of ClimateUtilities.ConvertToFahrenheit(.) method");
    }

    /**
     * Method to test the calculateAverageTemperature(.) method of
     * ClimateUtilities.
     */
    public void testCalculateAverageTemperature() {
    	double[] temp;
    	
    	System.out.println("Starting test of ClimateUtilities.calculateAverageTemperature(.) method");
    	
    	temp = new double[]{5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    	System.out.println("Testing input [5, 6, 7, 8, 9, 10, 11, 12, 13, 14]: output is: " + ClimateUtilities.calculateAverageTemperature(temp));

    	temp = new double[]{-15, -14, -13, -12, -11, -10, -9, -8, -7, -6};
    	System.out.println("Testing input [-15, -14, -13, -12, -11, -10, -9, -8, -7, -6]: output is: " + ClimateUtilities.calculateAverageTemperature(temp));

    	temp = new double[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 4};
    	System.out.println("Testing input [-5, -4, -3, -2, -1, 0, 1, 2, 3, 4]: output is: " + ClimateUtilities.calculateAverageTemperature(temp));
    	
    	try {
    		temp = new double[5];
        	System.out.println("Testing input");
    		temp[0] = scan.nextDouble();
    		temp[1] = scan.nextDouble();
    		temp[2] = scan.nextDouble();
    		temp[3] = scan.nextDouble();
    		temp[4] = scan.nextDouble();
    		
        	System.out.println(": output is: " + ClimateUtilities.calculateAverageTemperature(temp));
    	}catch(InputMismatchException e) {
    		System.out.println("Unexpected input");
    		scan.nextLine();
    	}
    	
    	System.out.println("Finished test of ClimateUtilities.calculateAverageTemperature(.) method");
    }

    /**
     * Run the test harness - to exercise the three methods of ClimateUtilities.
     *
     * @param args No arguments required.
     */
    public static void main(String[] args) {
/**        ClimateUtilitiesTestHarness harness = new ClimateUtilitiesTestHarness();
*        harness.testConvertToCelsius();
*        harness.testConvertToFahrenheit();
*        harness.testCalculateAverageTemperature();
        */
    	
    }

}
