package com.cs.iit.cs445.hw2.problem_5;

import java.util.Arrays;

import junit.framework.TestCase;

public class ImprovedStringTokenizerTest extends TestCase {

	public void testImprovedStringTokenizerString() {
		new ImprovedStringTokenizer("");
	}

	public void testImprovedStringTokenizerStringString() {
		new ImprovedStringTokenizer(" "," ");
	}

	public void testImprovedStringTokenizerStringStringBoolean() {
		new ImprovedStringTokenizer(" ", " ", true);
	}

	public void testListOfTokens() {
		
		ImprovedStringTokenizer stringTokenizerImproved = new ImprovedStringTokenizer("My name is Chintan");
		String[] listOfTokens = stringTokenizerImproved.listOfTokens();
		String[] outputShouldBe = {"My", "name", "is", "Chintan",};
		System.out.println(Arrays.deepToString(listOfTokens));
		assertTrue(Arrays.equals(outputShouldBe, listOfTokens));
	}
	
	public void testIfListOfTokensReturnsRemainingTokensWhenPassedNextToken() {
		ImprovedStringTokenizer stringTokenizerImproved = new ImprovedStringTokenizer("My name is Chintan");
		stringTokenizerImproved.nextToken();
		String[] listOfToken = stringTokenizerImproved.listOfTokens();
		String[] outputShouldBe = {"name","is","Chintan"};
		assertTrue(Arrays.equals(listOfToken, outputShouldBe));
	}

}
