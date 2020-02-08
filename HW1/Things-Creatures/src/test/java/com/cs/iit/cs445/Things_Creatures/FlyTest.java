package com.cs.iit.cs445.Things_Creatures;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class FlyTest extends TestCase{

	public void test_fly_constructor() {
		Creature wednesday = new Fly("Wednesday");
		
		assertEquals("Wednesday Fly", wednesday.toString());
	}

	public void test_fly_wont_eats_creature() {
		Creature thursday = new Fly("Thursday");
		Creature Friday = new Tiger("Friday");
		
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		thursday.eat(Friday);
		
		assertEquals("Thursday Fly won't eat a Friday Tiger.\n", out.toString());
	}
	
	public void test_fly_will_eat_things_but_not_creature() {
		Creature archie = new Fly("Archie");
		Creature teddy = new Tiger("Teddy");
		
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		archie.eat(teddy);
		
		assertEquals("Archie Fly won't eat a Teddy Tiger.\n", out.toString());
	}

	public void testMove() {
		Creature charlie = new Fly("Charlie");
		
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		charlie.move();
		
		assertEquals("Charlie Fly is buzzing around in flight.\n", out.toString());
	}

	public void test_how_the_fly_flies() {
		Creature buddy = new Fly("Buddy");
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		buddy.move();
		
		assertEquals("Buddy Fly is buzzing around in flight.\n", out.toString());
	}

}
