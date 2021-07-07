package com.projecteuler.sagari;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class ExHashSet {

	public static void main(String[] args) {

		HashSet<String> mySet = new HashSet<>();
		
		mySet.add("Apples");
		mySet.add("Banana");
		mySet.add("oranges");
		mySet.add("Pineapple");
		//mySet.add(null);

		Iterator<String> it = mySet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		List<String> myList = new ArrayList<>(mySet);
		for(String s: myList) {
			System.out.println(s);
		}
		TreeSet<String> myTree = new TreeSet<>(mySet);
		for(String str: myTree) {
			System.out.println(str);
		}
		String[] arr = new String[mySet.size()];
		mySet.toArray(arr);
		for(String s: arr) {
			System.out.println(s);
		}

	}

}
