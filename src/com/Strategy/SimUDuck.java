package com.Strategy;

import com.Strategy.Behaviours.FlyImpl.FlyNoWay;
import com.Strategy.Ducks.Duck;
import com.Strategy.Ducks.MallardDuck;

public class SimUDuck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Here we're dependent on the constructor
		//to do this dynamically we use a setter methods 
		Duck duck= new MallardDuck(); 
		duck.performFly();
		duck.performQuack();
		
		duck.setFlyBehaviour(new FlyNoWay());
		duck.performFly();
	}

}
