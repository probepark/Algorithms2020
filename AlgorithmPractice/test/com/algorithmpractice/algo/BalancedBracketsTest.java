package com.algorithmpractice.algo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.algorithmpractice.algo.BalancedBrackets;

public class BalancedBracketsTest {

	 @Test
	  public void TestCase1() {
	    String input = "()[]{}{";
	    assertTrue(!new BalancedBrackets().balancedBrackets(input));
	  }

	  @Test
	  public void TestCase2() {
	    String input = "(((((({{{{{[[[[[([)])]]]]]}}}}}))))))";
	    assertTrue(!new BalancedBrackets().balancedBrackets(input));
	  }

	  @Test
	  public void TestCase3() {
	    String input = "()()[{()})]";
	    assertTrue(!new BalancedBrackets().balancedBrackets(input));
	  }

	  @Test
	  public void TestCase4() {
	    String input = "(()())((()()()))";
	    assertTrue(new BalancedBrackets().balancedBrackets(input));
	  }

	  @Test
	  public void TestCase5() {
	    String input = "{}()";
	    assertTrue(new BalancedBrackets().balancedBrackets(input));
	  }

	  @Test
	  public void TestCase6() {
	    String input = "()([])";
	    assertTrue(new BalancedBrackets().balancedBrackets(input));
	  }

	  @Test
	  public void TestCase7() {
	    String input = "((){{{{[]}}}})";
	    assertTrue(new BalancedBrackets().balancedBrackets(input));
	  }

	  @Test
	  public void TestCase8() {
	    String input = "([])(){}(())()()";
	    assertTrue(new BalancedBrackets().balancedBrackets(input));
	  }

	  @Test
	  public void TestCase9() {
	    String input = "((({})()))";
	    assertTrue(new BalancedBrackets().balancedBrackets(input));
	  }

	  @Test
	  public void TestCase10() {
	    String input = "(([]()()){})";
	    assertTrue(new BalancedBrackets().balancedBrackets(input));
	  }

	  @Test
	  public void TestCase11() {
	    String input = "(((((([[[[[[{{{{{{{{{{{{()}}}}}}}}}}}}]]]]]]))))))((([])({})[])[])[]([]){}(())";
	    assertTrue(new BalancedBrackets().balancedBrackets(input));
	  }

	  @Test
	  public void TestCase12() {
	    String input = "{[[[[({(}))]]]]}";
	    assertTrue(!new BalancedBrackets().balancedBrackets(input));
	  }

	  @Test
	  public void TestCase13() {
	    String input = "[((([])([]){}){}){}([])[]((())";
	    assertTrue(!new BalancedBrackets().balancedBrackets(input));
	  }

	  @Test
	  public void TestCase14() {
	    String input = ")[]}";
	    assertTrue(!new BalancedBrackets().balancedBrackets(input));
	  }

}
