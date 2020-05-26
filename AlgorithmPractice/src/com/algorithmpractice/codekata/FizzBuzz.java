package com.algorithmpractice.codekata;

public class FizzBuzz {

	public static String fizzBuzz(int i){
		if(i==0)
			return "";
		return (i%5==0) ? ((i%7==0) ? "FizzBuzz" : "Fizz") : ((i%7==0) ? "Buzz" : " ");
	}
	
	public static void main(String[] args) {
		for(int i=0; i<50; i++) {
			System.out.println(i + " : " + fizzBuzz(i));
		}
	}
	
}
