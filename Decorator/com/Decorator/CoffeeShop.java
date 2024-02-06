package com.Decorator;

import com.Decorator.Beverage.Beverage;
import com.Decorator.ConcreteClass.Espresso;
import com.Decorator.DecoratorClasses.Milk;
import com.Decorator.DecoratorClasses.Mocha;

public class CoffeeShop {
	public static void main(String[] s) {
		Beverage order1= new Milk(new Mocha(new Espresso()));
		System.out.println(order1.getDescription()+" Rs."+order1.calcCost());
	}
}
