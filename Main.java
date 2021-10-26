package com.greatlearning.task3;

import java.util.Scanner;
import java.util.Stack;

public class Main{
	
	public static void main(String args[]){
		
		Scanner object=new Scanner(System.in);
		
		System.out.println("Enter The Total Number Of Floors In The Building:");
		int value=object.nextInt();
		int array[]=new int[value];
		
		for(int i=0;i<value;i++){
			
			System.out.println("Enter The Floor Size Given On Day:"+i);
			array[i]=object.nextInt();
			
		}
		
		int size[]=array.clone();
		Construction construction=new Construction();
		construction.mergeSortArray(size);
		
		Stack<Integer> stacks=new Stack<Integer>();
		
		for(int i:size)
			stacks.push(i);
		
		Stack<Integer> stacklist=new Stack<Integer>();
		System.out.println("The Order Of Construction Is As Follows:");
		
		for(int i=0;i<value;i++){
			
			System.out.println("Day:"+i);
			int list=array[i];
			int flag=stacks.peek();
			
			if(list != flag)
				stacklist.push(list);
			
			else{
				
				System.out.print(stacks.pop()+" ");
				
				while(!stacklist.isEmpty()&&stacks.peek() == stacklist.peek()){
					
					int delete=stacks.pop();
					stacklist.pop();
					System.out.print(delete+" ");
					
				}
				
			}
			
			System.out.println();
			
		}
		
		object.close();
		
	}
	
}
