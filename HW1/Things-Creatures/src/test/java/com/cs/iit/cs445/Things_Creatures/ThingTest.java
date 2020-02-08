package com.cs.iit.cs445.Things_Creatures;

import junit.framework.TestCase;

public class ThingTest extends TestCase {

	
	public void constructor_test() { 
		Thing mandi = new Thing("Mandi"); 
		assertEquals("Mandi", mandi.toString()); 
	}

	public void test_string_representation_of_thing_not_creature() {
		Thing banana = new Thing("Banana");
		assertEquals("Banana", banana.toString());
	}

	public void test_string_representation_of_creature() {
		Thing ant = new Ant("Charlie");
		assertEquals("Charlie Ant", ant.toString());
	}

}
