package com.cs.iit.cs445.Things_Creatures;

public class Ant extends Creature{

	//create Ant constructor with name
	public Ant(String name) {
		super(name);
}

	//answers how ants move
	@Override
	public void move() {
		System.out.println(this + " is crawling around.");
	}
}