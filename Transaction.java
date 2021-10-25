package com.greatlearning.homework3;

public class Transaction{

	 public static class Node{
		
		int key;
		Node left;
		Node right;

		public Node(int element){
			
			key=element;
			
		}
			
	}
	 
	public static Node prechild,postchild;
	
	public void binarySearchTreeToSkewedTree(Node root){
		
		if(root==null)
			return;
		
		binarySearchTreeToSkewedTree(root.left);
		Node rightchild=root.right;
		
		if(postchild==null){
			
			postchild=root;
			prechild=root;
			
		}
		
		else{
			
			prechild.right=root;
			prechild=root;
			
		}
		
		binarySearchTreeToSkewedTree(rightchild);
		
	}
	
	public void traversingThroughRightSkewedTree(Node root){
		
		if(root==null)
			return;
		
		System.out.print(root.key+" ");
		traversingThroughRightSkewedTree(root.right);
		
	}

}
