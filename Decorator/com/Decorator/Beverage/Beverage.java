package com.Decorator.Beverage;

public abstract class Beverage {
	protected String desc= "Unknown beverage";
	public String getDescription() {
		return desc;
	}
	public abstract int calcCost();

}
