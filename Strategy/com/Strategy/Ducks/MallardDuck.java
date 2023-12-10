package com.Strategy.Ducks;

import com.Strategy.Behaviours.FlyImpl.FlyWithWings;
import com.Strategy.Behaviours.QuackImpl.Quack;

public class MallardDuck extends Duck{
	public MallardDuck(){
		flyBehaviour= new FlyWithWings();
		quackBehaviour= new Quack();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Im a Mallard Duck");
	}

}
