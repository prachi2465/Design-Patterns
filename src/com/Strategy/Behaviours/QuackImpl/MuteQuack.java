package com.Strategy.Behaviours.QuackImpl;

import com.Strategy.Behaviours.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("<<Silence>>");
	}

}
