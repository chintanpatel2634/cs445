package com.cs.iit.cs445.Things_Creatures;

public class Tiger extends Creature{
		
	//constructor
	public Tiger(String name) {
		super(name);
	}
	
	//when tiger moves
	@Override
	public void move() {
		System.out.println(this + " has just pounced.");
	}
}
