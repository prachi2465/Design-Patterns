package com.ObserverPatt;

import com.ObserverPatt.ObserverImpl.CurrentConditionsDisplay;
import com.ObserverPatt.SubjectImpl.WeatherData;

public class WeatherStation {
	public static void main(String[] s) {
		// TODO Auto-generated method stub
		WeatherData weatherData= new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay= new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 61, 39.4f);
		weatherData.setMeasurements(85, 62, 37.4f);
	}
}
