package com.cs.iit.cs445.Things_Creatures;

public class Bat extends Creature implements Flyer{
	
	//create Bat constructor with name
	public Bat(String name) {
		super(name);
	}
	
	//prints what Creature eats
	@Override
	public void eat(Thing aThing) {
		if (aThing instanceof Creature) { //checks if he eats creature
			super.eat(aThing);
		}
		else if (!(aThing instanceof Creature) && (aThing instanceof Thing)) {  //checks if he eats things
			System.out.println(this  + " won't eat a " + aThing + ".");
		}
	}
	
	//print when Bat move
	@Override
	public void move() {
		fly();
	}
	
	//print when Bat flies 
	public void fly() {
		System.out.println(this + " is swooping through the dark.");
	}
}