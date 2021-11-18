package com.hen1;

public class ArrayExcercises {

	public static void main(String[] args) {
		// Maximum & Minimum number in the Array
	
	int []numbers= {15,65,43,23,10,45};
	
	int largestNumber=Integer.MIN_VALUE; // if can solve it numbers[0] 
	int smallestNumber=Integer.MAX_VALUE; // also can solve it number[5]
	
	for(int i=0;i<numbers.length;i++) {
		
		if(numbers[i]>largestNumber){
			largestNumber=numbers[i];
		}
	
	
		if (numbers[i]<smallestNumber) {
			smallestNumber=numbers[i];
		}
	
	}
	
	System.out.println(largestNumber);
	System.out.println(smallestNumber);
	
	}
	
	
	}

