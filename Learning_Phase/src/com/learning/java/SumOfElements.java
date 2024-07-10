package com.learning.java;

public class SumOfElements {

	public static void main(String[] args) {
		int[] array= {4,8,10,28,50};
		int sum=0;
		for(int i=0;i<=array.length-1;i++) {
			sum=sum+array[i];
		}
        System.out.println("Sum is: "+ sum );
	}

}
