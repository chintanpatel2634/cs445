package com.cs.iit.cs445.Things_Creatures;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class CreatureTest extends TestCase {

	public void test_creature_constructor() {
		Creature shaw = new Tiger("Shaw");
		
		assertEquals("Shaw Tiger", shaw.toString());
	}

	public void test_creature_eat_something_if_called() {
		Creature manu = new Bat("Manu");
		Creature jack = new Ant("Jack");
		
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		manu.eat(jack);

		assertEquals("Manu Bat has just eaten a Jack Ant.\n", out.toString());
	}

	public void test_movement_of_the_creature() {
		Creature sam = new Ant("Sam");
		
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		sam.move();
		
		assertEquals("Sam Ant is crawling around.\n", out.toString());
	}

	public void test_if_creature_eat_nothing() {
		Creature maggi = new Bat("Maggi");
		
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		maggi.whatDidYouEat();
		assertEquals("Maggi Bat has had nothing to eat!\n", out.toString());
	}

	public void test_if_creature_eat_something() {
		Creature samuel = new Tiger("Samuel");
		Creature mani = new Bat("Mani");
		samuel.eat(mani);

		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		samuel.whatDidYouEat();
		assertEquals("Samuel Tiger has eaten a Mani Bat!\n", out.toString());
	}
}
