import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * The Class DailyClimateData.
 */
public class DailyClimateData {

	/** The daily rain. */
	public double dailyRain;
	
	/** The date. */
	private static Date date;
	
	/** The temp. */
	private static Double[] temp = new Double[24];
	
	/** The press. */
	private static Double[] press = new Double[24];
	
	/**
	 * Instantiates a new daily climate data.
	 *
	 * @param dailyRainfall the daily rainfall
	 */
	public DailyClimateData(double dailyRainfall) {
		
		dailyRain = dailyRainfall;

		long time = System.currentTimeMillis();
		date = new Date(time);
		
	}
	
	/**
	 * Sets the hour temp.
	 *
	 * @param hour the hour
	 * @param temperature the temperature
	 */
	public static void setHourTemp(int hour, double temperature) {
		temp[hour] = temperature;
	}
	
	/**
	 * Sets the hour pressure.
	 *
	 * @param hour the hour
	 * @param pressure the pressure
	 */
	public static void setHourPressure(int hour, double pressure) {
		press[hour] = pressure;
	}
	
	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public static String getDate() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String newDate = sdf.format(date);
		
		return newDate;
	}
	
	/**
	 * Gets the hour temp.
	 *
	 * @param hour the hour
	 * @return the hour temp
	 */
	public static double getHourTemp(int hour) {
		return temp[hour];
	}
	
	/**
	 * Gets the hour pressure.
	 *
	 * @param hour the hour
	 * @return the hour pressure
	 */
	public static double getHourPressure(int hour) {
		return press[hour];
	}
	
	/**
	 * Gets the max temperature.
	 *
	 * @return the max temperature
	 */
	public static double getMaxTemperature() {
		Double x = null;
		for(int i = 0; i < temp.length; i++) {
			if(temp[i] != null) {
				if(x == null)
					x = temp[i];
				if(temp[i] > x)
					x = temp[i];
			}
		}
		
		return x;
	}
	
	/**
	 * Gets the min temperature.
	 *
	 * @return the min temperature
	 */
	public static double getMinTemperature() {
		Double x = null;
		for(int i = 0; i < temp.length; i++) {
			if(temp[i] != null) {
				if(x == null)
					x = temp[i];
				if(temp[i] < x)
					x = temp[i];
			}
		}
		
		return x;
	}
	
}
