package com.learning.datastructure;

public class Searching {

	public static void main(String[] args) {
		Searching a=new Searching();
		a.searchElement();
	}
	public void searchElement() {
		int[] array= {1,3,5,6,8,9};
		for(int i=0;i<=array.length-1;i++) {
			if(array[i]==5) {
				System.out.println("find the element 5 in position "+i);
			}
		}
	}

}
