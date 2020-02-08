package com.cs.iit.cs445.Things_Creatures;

public class TestCreature extends java.lang.Object{
	
	public static final int THING_COUNT = 10;
	public static final int CREATURE_COUNT = 6;

	public static void main(String[] args) {		
		
		Creature[] creatures = new Creature[CREATURE_COUNT];
		
		//instantiate creatures
		creatures[0] = new Ant("Felix");
		creatures[1] = new Bat("Jazzy");
		creatures[2] = new Fly("Margi");
		creatures[3] = new Tiger("Malibu");
		creatures[4] = new Ant("Sushi");
		creatures[5] = new Tiger("Vegas");
		
		Thing[] things = new Thing[THING_COUNT];
		
		//instantiate things
		things[0] = new Thing("Banana");
		things[1] = new Thing("Smoothie");
		things[2] = new Thing("Pizza");
		things[3] = new Thing("Berries");
		
		//adding creatures to the thing
		for(int i = 0; i < CREATURE_COUNT; i++) {
			things[i+4] = creatures[i];
		}
		
		System.out.println("Things:\n");
		
		//printing the string representation of things
		for(int i = 0; i < things.length; i++) {
			System.out.println(things[i]);
		}
		
		System.out.println("");
		
		System.out.println("Creatures:\n");

		//printing the string representation of creatures
		for(int i = 0; i < creatures.length; i++) {
			System.out.println(creatures[i]);
		}
		
		System.out.println("\nwhatDidYouEat() method calls on each Creatures:\n");
		
		for(int i = 0; i < creatures.length; i++) {
			creatures[i].whatDidYouEat();
		}
		
		System.out.println("\neat(aThing) method calls on each Creatures (aThing is not a creature):\n");
		
		for(int i = 0; i < 4; i++) {
			creatures[i].eat(things[i]);
		}
		
		System.out.println("\neat(aThing) method calls on each Creatures (aThing is a creature):\n");
		
		for(int i = 0; i < 4; i++) {
			creatures[i].eat(things[i+5]);
		}
		
		System.out.println("\nmove() method calls on each Creatures (Creatures that can fly will call fly()):\n");
		
		for(int i = 0; i < creatures.length; i++) {
			creatures[i].move();
		}

	}  
}
