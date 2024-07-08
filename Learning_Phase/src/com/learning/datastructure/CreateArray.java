package com.learning.datastructure;

import java.util.Arrays;

public class CreateArray {
	public static void main(String args[]) {
		CreateArray a = new CreateArray();
		System.out.println(Arrays.toString(a.createArr()));
	}

	public int[] createArr() {
		int[] arr = new int[10];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}
}