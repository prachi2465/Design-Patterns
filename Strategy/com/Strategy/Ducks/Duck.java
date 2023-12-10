package com.Strategy.Ducks;

import com.Strategy.Behaviours.FlyBehaviour;
import com.Strategy.Behaviours.QuackBehaviour;

public abstract class Duck {
	public Duck(){}
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	public abstract void display();
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour= quackBehaviour;
	}
	
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour= flyBehaviour;
	}
	public void swim() {
		System.out.println("All ducks swim");
	}
}
