package com.learning.collection;

import java.util.HashMap;

public class MapSample {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "John");
		hm.put(2, "Ram");
		hm.put(3, "Janu");
		hm.put(4, "jaz");
		for(int i:hm.keySet()) {
			System.out.println("key: "+i+"  value: "+hm.get(i));
		}
	}

}
