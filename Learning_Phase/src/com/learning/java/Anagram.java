package com.learning.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("cate");
		arrayList.add("dog");
		arrayList.add("tac");
		arrayList.add("god");
		arrayList.add("act");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String:");
		String st = sc.next();
		String sample = "";
		int count;
		for (int i = 0; i <= st.length() - 1; i++) {
			for (int j = 0; j <= arrayList.size() - 1; j++) {
				sample = arrayList.get(j);
				count = 0;
				for (int k = 0; k <= sample.length() - 1; k++) {
					if (st.charAt(i) != sample.charAt(k)) {
						count++;
						if (sample.length() == count) {
							arrayList.remove(j);
						}
					}
				}

			}
		}
		System.out.println(arrayList);
	}
}
