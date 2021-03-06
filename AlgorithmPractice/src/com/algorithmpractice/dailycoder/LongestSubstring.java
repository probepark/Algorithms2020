package com.algorithmpractice.dailycoder;

import java.util.HashSet;
import java.util.Set;

//Longest Substring

public class LongestSubstring {

	public int getLongestSubstring(String input){
		char[] charArray = input.toCharArray();
		Set<Character> charset = new HashSet<>();
		int longestSubstring = 0;
		for(int i = 0; i < charArray.length; i++){
	        int before = charset.size();
	        charset.add(charArray[i]);
	        int after = charset.size();
	        if(after > longestSubstring){
	            longestSubstring = after;
	        }
	        if(before == after){
                i--;
	            charset.clear();
	        }
		}
	    return longestSubstring;
	}

	public static void main(String[] args){
		LongestSubstring l = new LongestSubstring();
		String example = "abrkabcdefghijjxxx";
		System.out.println(l.getLongestSubstring(example));
	}

}
