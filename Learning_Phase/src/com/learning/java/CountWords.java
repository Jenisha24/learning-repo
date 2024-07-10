package com.learning.java;

public class CountWords {

	public static void main(String[] args) {
		String a="Good morning to all";
		int count=1;
		for(int i=0;i<=a.length()-1;i++) {
			if(a.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("words: "+ count);

	}

}
