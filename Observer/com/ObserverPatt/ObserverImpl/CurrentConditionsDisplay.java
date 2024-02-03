package com.ObserverPatt.ObserverImpl;

import com.ObserverPatt.Display.DisplayElement;
import com.ObserverPatt.Observer.Observer;
import com.ObserverPatt.SubjectImpl.WeatherData;

public class CurrentConditionsDisplay implements DisplayElement, Observer {
	private float temp, humidity;
	private WeatherData weatherData;
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temp=temp;
		this.humidity=humidity;
		display();
	}

	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData= weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current Conditions: "+temp+" F degrees and "+humidity+"% humidity");
	}

}
