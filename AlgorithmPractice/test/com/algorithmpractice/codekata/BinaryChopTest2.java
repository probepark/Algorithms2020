package com.algorithmpractice.codekata;

import static org.junit.Assert.*;

import org.junit.Test;

import com.algorithmpractice.codekata.BinaryChop2;

public class BinaryChopTest2 {

	private BinaryChop2 binaryChop = new BinaryChop2();
	
	
	@Test
	public void test1() {
		assertEquals(3, binaryChop.binaryChop(33, new int[] { 0, 1, 21, 33, 45, 45, 61, 71, 72, 73 }));
	}
	@Test
	public void test2() {
		assertEquals(3, binaryChop.binaryChop(111, new int[] { 1, 5, 23, 111 }));
	}
	@Test
	public void test3() {
		assertEquals(1, binaryChop.binaryChop(5, new int[] { 1, 5, 23, 111 }));
	}
	@Test
	public void test4() {
		assertEquals(-1, binaryChop.binaryChop(35, new int[] { 1, 5, 23, 111 }));
	}
	@Test
	public void test5() {
		assertEquals(8, binaryChop.binaryChop(72, new int[] { 0, 1, 21, 33, 45, 45, 61, 71, 72, 73 }));
	}
	@Test
	public void test6() {
		assertEquals(9, binaryChop.binaryChop(73, new int[] { 0, 1, 21, 33, 45, 45, 61, 71, 72, 73 }));
	}
	@Test
	public void test7() {
		assertEquals(-1, binaryChop.binaryChop(70, new int[] { 0, 1, 21, 33, 45, 45, 61, 71, 72, 73 }));
	}
	@Test
	public void test8() {
		assertEquals(10, binaryChop.binaryChop(355, new int[] { 0, 1, 21, 33, 45, 45, 61, 71, 72, 73, 355 }));
	}
	@Test
	public void test9() {
		assertEquals(-1, binaryChop.binaryChop(354, new int[] { 0, 1, 21, 33, 45, 45, 61, 71, 72, 73, 355 }));
	}

}
