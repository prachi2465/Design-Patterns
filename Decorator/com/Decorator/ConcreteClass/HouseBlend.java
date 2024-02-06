package com.Decorator.ConcreteClass;

import com.Decorator.Beverage.Beverage;

public class HouseBlend extends Beverage{
	public HouseBlend() {
		desc= "HouseBlend";
	}
	@Override
	public int calcCost() {
		// TODO Auto-generated method stub
		return 60;
	}

}
