package com.cs.iit.cs445.hw2.question_4;

import java.util.Random;

public class ImprovedRandom extends Random{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Random random = new Random();
	
	public ImprovedRandom(long seed) {
		super(seed);
	}
	
	public ImprovedRandom() {
		super();
	}
	
	public int nextIntBetweenNumbers(int a, int b) {
		return random.nextInt((b-a) + 1) + a;
	}

	
}
