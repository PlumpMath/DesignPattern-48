package designPattern.observer;

public class WeatherStation {
	public static void main(String[] args) {
		WetherData weatherData = new WetherData();
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurement(25, 78, 23.2f);
	}
}
