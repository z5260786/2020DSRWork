/**
 * Utility class with useful climate related conversion functions. Methods of 
 * this class are static. They can be called directly when required without instantiating
 * and object of type ClimateUtilities. 
 * 
 * @author Kathryn Merrick
 *
 * @version 24/02/2015
 *
 */
public class ClimateUtilities 
{

	/**
	 * Method to convert temperature in degrees Fahrenheit to degrees Celsius
	 * 
	 * @param fahrenheit The temperature in degrees Fahrenheit to convert
	 * @return The temperature in degrees Celsius
	 */
	public static double convertToCelsius(double fahrenheit)
	{
		return (fahrenheit - 32) * 5/9;
	}
	
	/**
	 * Method to convert temperature in degrees Celsius to degrees Fahrenheit
	 * 
	 * @param celsius The temperature in degrees Celsius to convert
	 * @return The temperature in degrees Fahrenheit
	 */
	public static double convertToFahrenheit(double celsius)
	{
		return celsius * 9/5 + 32;
	}
	
	/**
	 * Compute the average temperature given an array of temperatures 
	 * 
	 * @param temperatures The array of temperature readings to average
	 * @return The average of the given set of temperatures
	 */
	public static double calculateAverageTemperature(double[] temperatures)
	{
		double sum = 0;
		for(double temp : temperatures)
			sum += temp;
		return sum/temperatures.length;
	}
}
