package com.Decorator.DecoratorClasses;

import com.Decorator.Beverage.Beverage;
import com.Decorator.CondimentDecorator.CondimentDecorator;

public class Milk extends CondimentDecorator{
	public Milk(Beverage beverage) {
		this.beverage= beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+"+"+"Milk";
	}

	@Override
	public int calcCost() {
		// TODO Auto-generated method stub
		return beverage.calcCost()+10;
	}
}
