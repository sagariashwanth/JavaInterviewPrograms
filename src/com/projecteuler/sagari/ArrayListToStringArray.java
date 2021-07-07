package com.projecteuler.sagari;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListToStringArray {

	public static void main(String[] args) {

		ArrayList<String> myList = new ArrayList<>();
		myList.add("Seattle");
		myList.add("Krabi");
		myList.add("Thailand");
		
		System.out.println(myList);
		Collections.reverse(myList);
		System.out.println("After reverse: "+myList);
		/*
		 * Method 1: to create a separate StringArray of size ArrayList
		 */
		String[] strArray = new String[myList.size()];
		for(int j=0; j<myList.size();j++) {
			strArray[j] = myList.get(j);
		}
		/*
		 * Method2: Using toArray()
		 */
		String[] strArray2 = myList.toArray(new String[myList.size()]);
		
		for(String k: strArray) {
			System.out.println(k);
		}
		for(String k : strArray2) {
			System.out.println(k);
		}


	}

}
