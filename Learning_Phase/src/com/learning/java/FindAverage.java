package com.learning.java;

public class FindAverage {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int sum=0;
		int length;
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		float avg=sum /a. length;
		System.out.print("average of Array: "+ avg);

	}

}
