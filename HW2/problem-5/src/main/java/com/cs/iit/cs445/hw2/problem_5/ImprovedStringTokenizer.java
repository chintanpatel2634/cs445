package com.cs.iit.cs445.hw2.problem_5;

import java.util.StringTokenizer;

public class ImprovedStringTokenizer extends StringTokenizer{

	ImprovedStringTokenizer(String  str) {
		super(str);
	}
	
	ImprovedStringTokenizer(String str, String delim) {
		super(str, delim);
	}
	
	ImprovedStringTokenizer(String str, String delim, boolean returnDelims) {
		super(str,delim,returnDelims);
	}
	
	String[] listOfTokens() {
        String [] allTokensRemaining = new String [countTokens()];
        int index = 0;
        while(hasMoreTokens()){
            allTokensRemaining[index] = nextToken();
            index++;
        }
        return allTokensRemaining;
		
	}
	
}
