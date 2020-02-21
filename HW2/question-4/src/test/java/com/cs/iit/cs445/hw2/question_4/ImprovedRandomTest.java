package com.cs.iit.cs445.hw2.question_4;

import junit.framework.TestCase;

public class ImprovedRandomTest extends TestCase {

	public void testIfRandomNumberGenerated() {
		
		new ImprovedRandom(1);
		ImprovedRandom objectImprovedRandom = new ImprovedRandom();
		
		int randomNumBetween = objectImprovedRandom.nextIntBetweenNumbers(1, 11);
		assertTrue(randomNumBetween >= 1 && randomNumBetween < 11);
		
	}
	
	
}
