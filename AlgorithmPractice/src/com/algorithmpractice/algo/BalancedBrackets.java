package com.algorithmpractice.algo;

import java.util.*;

public class BalancedBrackets {
	private static Map<Character, Character> bracketPairs = new HashMap<>();
	private static Stack<Character> openBrackets = new Stack<>();
	static {
		bracketPairs.put('{', '}');
		bracketPairs.put('(', ')');
		bracketPairs.put('[', ']');
	}

	//time o(n) bc we traverse through the string once / space o(n) bc we are using a stack
	public static boolean balancedBrackets(String str) {
		openBrackets.clear();
		
		for (int i = 0; i < str.length(); i++) {
			if (bracketPairs.containsKey(str.charAt(i))) {
				openBrackets.push(str.charAt(i));
			}
			if (bracketPairs.containsValue(str.charAt(i))) {
				if(openBrackets.isEmpty())
					return false;
				if (bracketPairs.get(openBrackets.peek()).equals(str.charAt(i))) {
					openBrackets.pop();
				} else {
					return false;
				}
			}
		}

		if (!openBrackets.isEmpty())
			return false;

		return true;
	}

	public static void main(String[] args) {
		String input = "{}()";
		System.out.println(balancedBrackets(input));
	}

}
