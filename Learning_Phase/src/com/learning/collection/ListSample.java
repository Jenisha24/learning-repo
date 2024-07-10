package com.learning.collection;

import java.util.ArrayList;

public class ListSample {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(5);
		a.add(7);
		a.add(9);
		a.add(1);
		for(int i:a) {
			System.out.println(i);
		}
	}

}
