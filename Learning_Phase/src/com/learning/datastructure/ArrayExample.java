package com.learning.datastructure;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String args[]) {
		ArrayExample a = new ArrayExample();
		System.out.println(Arrays.toString(a.createArray()));
	}

	public int[] createArray() {
		int[] array = new int[10];
		for (int i = 0; i <= array.length - 1; i++) {
			array[i] = i + 1;
		}
		return array;
	}
}