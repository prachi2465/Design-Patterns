package com.ObserverPatt.SubjectImpl;

import java.util.ArrayList;
import java.util.List;

import com.ObserverPatt.Observer.Observer;
import com.ObserverPatt.Subject.Subject;

public class WeatherData implements Subject {
	private List<Observer> observers;
	private float temp, humidity, pressure;
	public WeatherData() {
		observers= new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stu
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer o: observers) {
			o.update(temp, humidity, pressure);
		}
	}
	
	public void measurementChanged() {
		notifyObserver();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementChanged();
	}

}
