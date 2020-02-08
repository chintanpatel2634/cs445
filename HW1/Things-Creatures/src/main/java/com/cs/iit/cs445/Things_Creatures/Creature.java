package com.cs.iit.cs445.Things_Creatures;

public abstract class Creature extends Thing{

	private Thing thingEatenLast;//last thing the creature eats
	
	//constructor
	public Creature(String name) {
		super(name);
	}
	
	//what does the creature eats
	public void eat(Thing aThing) {
		System.out.println(this + " has just eaten a " + aThing + ".");
		thingEatenLast = aThing;
	}
	
	//how the creature moves
	public abstract void move();
	
	//what the creature eat recently
	public void whatDidYouEat() {
		if (thingEatenLast == null) {//if nothing eaten
			System.out.println(this + " has had nothing to eat!");
		}	
		else {//if thingEaten
			System.out.println(this + " has eaten a " + thingEatenLast + "!");
		}
	}

}
 	