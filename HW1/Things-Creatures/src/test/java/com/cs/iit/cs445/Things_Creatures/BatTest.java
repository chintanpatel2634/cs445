package com.cs.iit.cs445.Things_Creatures;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class BatTest extends TestCase{

	public void test_bat_constructor() {
		Creature frankie = new Bat("Frankie");
		
		assertEquals("Frankie Bat", frankie.toString());
	} 
	
	public void test_bat_can_eat_creatures() {
		Creature ollie = new Bat("Ollie");
		Creature jack = new Ant("Jack");
		
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ollie.eat(jack);
		
		assertEquals("Ollie Bat has just eaten a Jack Ant.\n", out.toString());
	}
	
	public void test_bat_wont_eat_thing_except_creature() {
		Creature bella = new Bat("Bella");
		Thing stone = new Thing("Stone");
		
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		bella.eat(stone);
		
		assertEquals("Bella Bat won't eat a Stone.\n", out.toString());
	}

	public void test_how_bat_move() {

		Creature coco = new Bat("Coco");
		
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		coco.move();
		
		assertEquals("Coco Bat is swooping through the dark.\n", out.toString());
	}

	public void test_how_the_bat_flies() {
		Creature molly = new Bat("Molly");
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		molly.move();
		
		assertEquals("Molly Bat is swooping through the dark.\n", out.toString());
	}

}
