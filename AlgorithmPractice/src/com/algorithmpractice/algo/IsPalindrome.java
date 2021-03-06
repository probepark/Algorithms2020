package com.algorithmpractice.algo;

public class IsPalindrome {

	//o(n^2) time and o(n) space
	public static boolean isPalindrome3(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i > -1; i--) {
			reversed+=str.charAt(i);
		}
		if (str.equals(reversed)) {
			return true;
		}
		return false;
	}
	
	//o(n) ts
	public static boolean isPalindrome2(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i > -1; i--) {
			sb.append(str.charAt(i));
		}
		if (str.equals(sb.toString())) {
			return true;
		}
		return false;
	}
	
	//O(n) ts
	public static boolean isPalindrome1(String str) {
		StringBuilder sb = new StringBuilder(str);
		if (sb.toString().equals(sb.reverse().toString())) {
			return true;
		}
		return false;
	}
	
	//o(n) time and o(1) aka constant space aka optimal solution
	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length()-1;
		while(left < right){
			if(str.charAt(left) != str.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
  }

	public static void main(String[] args) {
		System.out.println(isPalindrome("ab"));
		System.out.println(isPalindrome("bab"));
	}
}
