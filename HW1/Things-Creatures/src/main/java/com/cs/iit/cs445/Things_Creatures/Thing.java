package com.cs.iit.cs445.Things_Creatures;

public class Thing extends java.lang.Object{
	
	//constant name
	private final String name;
	
	//constructor
	public Thing(String name) {
		this.name = name; 
	} 
	 
	//string representation of things
	@Override
	public String toString() {  //string representation of the object
		if (this instanceof Creature) { //if the thing is a creature
			return this.name + " " + this.getClass().getSimpleName();
		}
		else {	//if the thing is not a creature
		return this.name;
		}
	}
}
