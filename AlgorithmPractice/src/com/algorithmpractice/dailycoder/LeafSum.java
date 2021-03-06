package com.algorithmpractice.dailycoder;

import java.util.*;

public class LeafSum {
	
	public static class Node{
		private int value;
		private Node left;
		private Node right;
		public Node(int value){
			this.value = value;
		}
		public void addChild(int value) {
			Node child = new Node(value);
			if(this.left == null) {
				this.left = child;
			}else if(this.right == null){
				this.right = child;
			}
		}
	}
	
	public static int getLeafSum(Node node) {
		return getLeafSum(node, 0);
	}
	
	public static int getLeafSum(Node node, int value) {
		if(node == null)
			return 0;
		
		value = value * 10 + node.value;
		
		if(node.left == null && node.right == null) {
			return value;
		}
		
		return getLeafSum(node.left, value) + getLeafSum(node.right, value);
	}
	
	public static void dfs(Node node , List<Integer> result){
		result.add(node.value);
		
		if(node.left == null && node.right == null)
			return;
		
		dfs(node.left, result);
		dfs(node.right, result);
	}
	
	public static List<Integer> dfs2(Node node , List<Integer> result){
		result.add(node.value);
		
		if(node.left == null && node.right == null)
			return result;
		
		dfs2(node.left, result);
		dfs2(node.right, result);
		return result;
	}
	
	public static void main(String[] args) {
		Node n = new Node(1);
		n.addChild(2);
		n.addChild(3);
		n.left.addChild(4);
		n.left.addChild(5);
//		List<Integer> a = new ArrayList<>(); 
//		dfs(n,a);
		List<Integer> a = dfs2(n,new ArrayList<>());
		a.forEach(i->System.out.println(i));
		System.out.println("124 + 125 + 13 = " + getLeafSum(n));
	}
}
