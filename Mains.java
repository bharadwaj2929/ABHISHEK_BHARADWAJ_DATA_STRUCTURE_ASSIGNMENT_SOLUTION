package com.greatlearning.homework3;

import com.greatlearning.homework3.Transaction.Node;

public class Mains{

	public static void main(String[] args){
		
		Transaction transaction=new Transaction();
		
		Node root=new Node(50);
		Node node1=new Node(30);
		Node node2=new Node(60);
		Node node3=new Node(10);
		Node node4=new Node(40);
		
		root.left=node1;
		root.right=node2;
		root.left.left=node3;
		root.right.left=node4;
		
		transaction.binarySearchTreeToSkewedTree(root);
		transaction.traversingThroughRightSkewedTree(Transaction.postchild);
		
	}
	
}
