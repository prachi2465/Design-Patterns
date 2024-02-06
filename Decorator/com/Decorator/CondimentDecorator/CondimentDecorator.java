package com.Decorator.CondimentDecorator;

import com.Decorator.Beverage.Beverage;

public abstract class CondimentDecorator extends Beverage{
	protected Beverage beverage;
	public abstract String getDescription();
}
