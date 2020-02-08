package com.cs.iit.cs445.Things_Creatures;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class TigerTest extends TestCase{

	public void test_tiger_constructor() {
		Creature toby = new Tiger("Toby");
		
		assertEquals("Toby Tiger", toby.toString());
	}
	
	public void test_tiger_move() {
		Creature bailey = new Tiger("Bailey");
		
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		bailey.move();
		
		assertEquals("Bailey Tiger has just pounced.\n", out.toString());
	}

}
