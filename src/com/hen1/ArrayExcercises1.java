package com.hen1;

public class ArrayExcercises1 {

	public static void main(String[] args) {
		// write a Java program to find the second largest number in the array.

		int[] numbers = { 15, 10, 17, 13, 30 };

	int largestNumber=Integer.MIN_VALUE;
	int secondLargest=Integer.MIN_VALUE;
	
	for (int number:numbers) {
		
	if(number>largestNumber) {
		secondLargest=largestNumber;
		largestNumber=number;
	
	}else if(number>secondLargest && largestNumber !=number) {
		
		
	}
	
	}
	System.out.println("SecondLargest number is "+secondLargest);
	
	}

}
