package com.Decorator.ConcreteClass;

import com.Decorator.Beverage.Beverage;

public class Espresso extends Beverage {
	public Espresso() {
		desc= "Espresso";
	}
	@Override
	public int calcCost() {
		// TODO Auto-generated method stub
		return 50;
	}

}
