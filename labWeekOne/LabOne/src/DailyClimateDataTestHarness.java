/**
 * Test Harness for DailyClimateData
 * 
 * @author ethan
 * 
 *
 */
public class DailyClimateDataTestHarness {
	
	/**
	 * Method to test DailyClimateData.getHourTemp(.) and DailyClimateData.setHourTemp(.)
	 */
	public void testGetSetHourTemp() {
		/**
		 * Set a random temperature for each hour of the day
		 * Then print out each temperature
		 */
		System.out.println("--Starting test of DailyClimateData.getHourTemp(.) and DailyClimateData.setHourTemp(.)--");
		for(int i = 0; i < 24; i++) {
			DailyClimateData.setHourTemp(i, Math.floor(Math.random()*(10) + 20));
		}
		
		for(int i = 0; i < 24; i++) {
			System.out.println("Hour " + i + ":00 - " + DailyClimateData.getHourTemp(i) + " degrees");
		}
		System.out.println("--Finished test of DailyClimateData.getHourTemp(.) and DailyClimateData.setHourTemp(.)--");
	}
	
	/**
	 * Method to test DailyClimateData.getHourPressure(.) and DailyClimateData.setHourPressure(.)
	 */
	public void testGetSetHourPressure() {
		/**
		 * Set a random pressure for each hour of the day
		 * Then print out each pressure
		 */
		System.out.println("--Starting test of DailyClimateData.getHourPressure(.) and DailyClimateData.setHourPressure(.)--");
		for(int i = 0; i < 24; i++) {
			DailyClimateData.setHourPressure(i, Math.floor((Math.random()*(50) + 50)));
		}
		
		for(int i = 0; i < 24; i++) {
			System.out.println("Hour " + i + ":00 - " + DailyClimateData.getHourPressure(i) + "% Pressure");
		}
		System.out.println("--Finished test of DailyClimateData.getHourPressure(.) and DailyClimateData.setHourPressure(.)--");
	}
	
	/**
	 * Method to test DailyClimateData.getMaxTemperature(.)
	 */
	public void testGetMaxTemperature() {
		System.out.println("--Starting test of DailyClimateData.getMaxTemperature(.)--");
		System.out.println("Maximum temperature: " + DailyClimateData.getMaxTemperature());
		System.out.println("--Finished test of DailyClimateData.getMaxTemperature(.)--");
	}
	
	/**
	 * Method to test DailyClimateData.getMinTemperature(.)
	 */
	public void testGetMinTemperature() {
		System.out.println("--Starting test of DailyClimateData.getMinTemperature(.)--");
		System.out.println("Minimum temperature: " + DailyClimateData.getMinTemperature());
		System.out.println("--Finished test of DailyClimateData.getMinTemperature(.)--");		
	}
	
	/**
	 * Method to test DailyClimateData.getDate(.)
	 */
	public void testGetDate() {
		System.out.println("--Starting test of DailyClimateData.getDate(.)--");
		DailyClimateData daily = new DailyClimateData(24);
		System.out.println("Date: " + DailyClimateData.getDate());
		System.out.println("--Finished test of DailyClimateData.getDate(.)--");
	}
	
	public static void main(String[] args) {
		DailyClimateDataTestHarness harness = new DailyClimateDataTestHarness();
		harness.testGetSetHourPressure();
		harness.testGetSetHourTemp();
		harness.testGetMaxTemperature();
		harness.testGetMinTemperature();
		harness.testGetDate();
	}
	
}
