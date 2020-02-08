package com.cs.iit.cs445.Things_Creatures;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class AntTest extends TestCase{

	public void test_ant_constructor() {
		Creature sunday = new Ant("Sunday");
		
		assertEquals("Sunday Ant", sunday.toString());
	}

	public void test_how_the_ant_move() {
		Creature monday = new Ant("Monday");
		
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		monday.move();
		assertEquals("Monday Ant is crawling around.\n", out.toString());
	}
}
