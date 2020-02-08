package com.cs.iit.cs445.Things_Creatures;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class TestCreatureTest extends TestCase{

	private String output = "";

	public void test_testcreature_main() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args = {};
		
		TestCreature.main(args);
		
		//creating the output
		String thingsTitle = "Things:\n\n";
		String thingsName = "Banana\n" + "Smoothie\n" + "Pizza\n" + "Berries\n" + "Felix Ant\n" + "Jazzy Bat\n" + "Margi Fly\n" + "Malibu Tiger\n" + "Sushi Ant\n" + "Vegas Tiger\n\n";
		
		String creaturesTitle = "Creatures:\n\n";
	    String creaturesName = "Felix Ant\n" + "Jazzy Bat\n" + "Margi Fly\n" + "Malibu Tiger\n" + "Sushi Ant\n" + "Vegas Tiger\n\n";
	    
	    String whatDidYouEatTitle = "whatDidYouEat() method calls on each Creatures:\n\n";
	    String whatDidYouEatCreatures = "Felix Ant has had nothing to eat!\n" + "Jazzy Bat has had nothing to eat!\n" + "Margi Fly has had nothing to eat!\n" + "Malibu Tiger has had nothing to eat!\n" + "Sushi Ant has had nothing to eat!\n" + "Vegas Tiger has had nothing to eat!\n\n";

	    String eatMethodNotCreatureTitle = "eat(aThing) method calls on each Creatures (aThing is not a creature):\n\n";
	    String eatMethodNotCreatures = "Felix Ant has just eaten a Banana.\n" + "Jazzy Bat won't eat a Smoothie.\n" + "Margi Fly has just eaten a Pizza.\n" + "Malibu Tiger has just eaten a Berries.\n\n";
	    
	    String eatMethodCreatureTitle = "eat(aThing) method calls on each Creatures (aThing is a creature):\n\n";
	    String eatMethodCreatures = "Felix Ant has just eaten a Jazzy Bat.\n" + "Jazzy Bat has just eaten a Margi Fly.\n" + "Margi Fly won't eat a Malibu Tiger.\n" + "Malibu Tiger has just eaten a Sushi Ant.\n\n";
	    
	    String moveMethodTitle = "move() method calls on each Creatures (Creatures that can fly will call fly()):\n\n";
	    String moveMethod = "Felix Ant is crawling around.\n" + "Jazzy Bat is swooping through the dark.\n" + "Margi Fly is buzzing around in flight.\n" + "Malibu Tiger has just pounced.\n" + "Sushi Ant is crawling around.\n" + "Vegas Tiger has just pounced.\n";
	    
	    //output to assertequal with the result
	    output = thingsTitle + thingsName + creaturesTitle + creaturesName + whatDidYouEatTitle + whatDidYouEatCreatures + eatMethodNotCreatureTitle + eatMethodNotCreatures + eatMethodCreatureTitle + eatMethodCreatures + moveMethodTitle + moveMethod;
	    assertEquals(output, out.toString());
		
	}

}
