//package com.algorithmpractice.recursionpractice;
//
//import java.util.HashMap;
//import java.util.Stack;
//
//public class RecursionPractice {
//
//	public void recurse_stack(Long a) {
//		if (a == 0)
//			return;
//		else {
//			System.out.println(a);
//			recurse_stack(a-1);
//			System.out.println(a);
//			return;
//		}
//	}
////	
////	public Long recurse(Long a) {
////		if (a == 0)
////			return 0;
////		else {
////			return recurse(a-1);
////		}
////	}
//	
//	public Long fibr(Long n, Stack stack) {
//		System.out.println("n="+n + "push");stack.push(n);System.out.println(stack.toString());
//		if(n==0 || n==1) {
//			 System.out.println("pop");stack.pop();System.out.println(stack.toString());return n;
//		}
//		else {
//			Long a = fibr(n-1, stack);
//			Long b = fibr(n-2, stack);
//			System.out.println("pop");stack.pop();System.out.println(stack.toString());return a + b;
//		}
//	}
//	
//	public Long fib(Long n) {
//		if(n==0 || n==1)
//			return n;
//		return fib(n-1)+fib(n-2);
//	}
//
//	private HashMap<Long, Long> memoization = new HashMap<>();
//
//	public void initFibm(HashMap<Long, Long> m) {
//		m.put(new Long(0),new Long(0));
//		m.put(new Long(1),new Long(1));
//	}
//	
//	public Long fibm(Long n, HashMap<Long, Long> m) {
// 		if(m.containsKey(n)) {
//			return (Long) m.get(n);
//		}
//		else {
//			m.put(n, fibm(n-1,m)+fibm(n-2,m));
//		}
//		return m.get(n);
//	}
//	
//	//Tabulation
//	public Long fibTabulated(Long n) {
//		Long[] f = new Long[(n.intValue()+2)];
//		f[0]=new Long(0);
//		f[1]=new Long(1);
//		
//		for(int i=2;i<=n.intValue();i++) {
//			f[i] = f[i-1] + f[i-2];
//		}
//		
//		return f[n.intValue()];
//	}
//
//	public static void main(String[] args) {
//		RecursionPractice rp = new RecursionPractice();
////		System.out.println(rp.recurse(5));
////		rp.fibr(5, new Stack());
//		rp.initFibm(rp.memoization);
//		//for(Long i =0; i<7; i++)
////			System.out.println(rp.fibm(6, rp.memoization));
////		long startTime = System.currentTimeMillis();
////		System.out.println(rp.fib((long) 100));
////		long finishTime = System.currentTimeMillis();
////		System.out.println("That took: " + (finishTime - startTime) + " ms");
//		
//			long startTime1 = System.currentTimeMillis();
//			System.out.println(rp.fibm(new Long(1000), rp.memoization));
//			long finishTime1 = System.currentTimeMillis();
//			System.out.println("That took: " + (finishTime1 - startTime1) + " ms");
//			
//			long startTime2 = System.currentTimeMillis();
//			System.out.println(rp.fibTabulated(new Long(1000)));
//			long finishTime2 = System.currentTimeMillis();
//			System.out.println("That took: " + (finishTime2 - startTime2) + " ms");
//	}
//
//}
package com.algorithmpractice.algo;

import java.util.HashMap;
import java.util.Stack;

public class RecursionPractice {

	public void recurse_stack(int a) {
		if (a == 0)
			return;
		else {
			System.out.println(a);
			recurse_stack(a - 1);
			System.out.println(a);
			return;
		}
	}

	public int fibr(int n, Stack<Integer> stack) {
		System.out.println("n=" + n + "push");
		stack.push(n);
		System.out.println(stack.toString());
		if (n == 0 || n == 1) {
			System.out.println("pop");
			stack.pop();
			System.out.println(stack.toString());
			return n;
		} else {
			int a = fibr(n - 1, stack);
			int b = fibr(n - 2, stack);
			System.out.println("pop");
			stack.pop();
			System.out.println(stack.toString());
			return a + b;
		}
	}

	public int fib(int n) {
		if (n == 0 || n == 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

	private HashMap<Integer, Integer> memoization = new HashMap<>();

	public void initFibm(HashMap<Integer, Integer> m) {
		m.put(0, 0);
		m.put(1, 1);
	}

	// Memoization
	public Integer fibm(Integer n, HashMap<Integer, Integer> m) {
		if (m.containsKey(n)) {
			return (Integer) m.get(n);
		} else {
			m.put(n, fibm(n - 1, m) + fibm(n - 2, m));
		}
		return m.get(n);
	}

	// Tabulation
	public int fibTabulated(int n) {
		int[] f = new int[n + 2];
		f[0] = 0;
		f[1] = 1;

		for (int i = 2; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}

		return f[n];
	}

	public static void main(String[] args) {
		new RecursionPractice();
		System.out.println(0 / 2);
	}

	public HashMap<Integer, Integer> getMemoization() {
		return memoization;
	}

	public void setMemoization(HashMap<Integer, Integer> memoization) {
		this.memoization = memoization;
	}

}
