package com.learning.java;

public class SmallestElement {

	public static void main(String[] args) {
		int[] array= {32,54,87,93,20};
		int min=array[0];
		for(int i=1;i<=array.length-1;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		System.out.println("the smallest element is:"+min);
	}

}
