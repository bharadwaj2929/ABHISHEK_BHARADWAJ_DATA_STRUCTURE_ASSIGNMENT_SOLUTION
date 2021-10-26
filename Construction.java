package com.greatlearning.task3;

public class Construction{
	
	private void mergeSortArray(int array[],int left,int right){
		
		if(right>left){
			
			int middle=left+(right-left)/2;
			mergeSortArray(array,left,middle);
			mergeSortArray(array,middle+1,right);
			mergeSort(array,left,middle,right);
			
		}
		
	}
	
	private void mergeSort(int array[],int left,int middle,int right){
		
		int number1=middle-left+1,number2=right-middle;
		
		int leftArray[]=new int[number1];
		int rightArray[]=new int[number2];
		
		for(int i=0;i<number1;i++)
			leftArray[i]=array[left+i];
		
		for(int j=0;j<number2;j++)
			rightArray[j]=array[middle+1+j];
		
		int i=0,j=0,k=left;
		
		while(i<number1 && j<number2){
			
			if(leftArray[i] <= rightArray[j]){
				
				array[k]=leftArray[i];
				i++;
				
			}
			
			else{
				
				array[k]=rightArray[j];
				j++;
				
			}
			
			k++;
			
		}
		
		while(i<number1){
			
			array[k]=leftArray[i];
			i++;
			k++;
			
		}
		
		while(j<number2){
			
			array[k]=rightArray[j];
			j++;
			k++;
			
		}
		
	}
	
	public void mergeSortArray(int size[]){
		
		mergeSortArray(size,0,size.length-1);
		
	}
	
}
