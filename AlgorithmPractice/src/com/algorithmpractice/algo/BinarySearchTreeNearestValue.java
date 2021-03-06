package com.algorithmpractice.algo;

public class BinarySearchTreeNearestValue {

	//average : O(log(n)) time and O(1) space
	//worst : O(n) time and O(1) if the tree is linked list / extremely unbalanced
	public static int findClosestValueInBst(BST tree, int target) {
		
		int closest = tree.value;
		while(tree != null){
			if(Math.abs(tree.value - target) < Math.abs(closest - target))
				closest = tree.value;
			
			if(target < tree.value){
				tree = tree.left;
			}else{
				tree = tree.right;
			}
		}
		
		return closest;
  }


	public static class BST {
		public int value;
		public BST left;
		public BST right;

		public BST(int value) {
			this.value = value;
		}

	}
}
