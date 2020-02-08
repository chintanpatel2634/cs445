package com.cs.iit.cs445.Things_Creatures;

public class Fly extends Creature implements Flyer{
		
	//constructor
	public Fly(String name) {
		super(name);
	}
	
	//prints when Fly eats
	@Override
	public void eat(Thing aThing) {
		if ((aThing instanceof Creature)) { //if fly tries to eat a creature
			System.out.println(this + " won't eat a " + aThing + ".");
		}
		else {   //if fly eats a thing
			super.eat(aThing);
		}
	}
	
	//prints when Fly moves
	@Override
	public void move() {
		fly();
	}
	
	//prints when Fly flies
	public void fly() {
		System.out.println(this + " is buzzing around in flight.");
	}
	
}
