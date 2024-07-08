package com.learning.datastructure;

import java.util.Arrays;

public class Shorting {

	public static void main(String[] args) {
		Shorting a=new Shorting();
		a.shortingArray();

	}
	public void shortingArray() {
		int[] Array= {5,3,8,6,9,1};
		for(int i=0;i<=Array.length-1;i++) {
			for(int j=i+1;j<=Array.length-1;j++) {
				if(Array[j]<Array[i]) {
					int temp=Array[i];
					Array[i]=Array[j];
					Array[j]=temp;
				}
			}
		}
		System.out.print(Arrays.toString(Array));
	}

}
