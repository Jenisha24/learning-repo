package com.learning.collection;

import java.util.HashSet;

public class SetSample {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("apple");
		hs.add("orange");
		hs.add("banana");
		hs.add("grapes");
		hs.add("Cherry");
		System.out.println(hs);
		hs.remove("banana");
		hs.remove("Cherry");
		System.out.println(hs);
		System.out.println(hs.size());
		hs.clear();
		System.out.println(hs.size());



	}

}
