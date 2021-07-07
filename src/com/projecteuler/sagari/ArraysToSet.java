package com.projecteuler.sagari;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArraysToSet {

	public static void main(String[] args) {
		
		Integer[] num = {1,2,4,6,7,8};
		
		List<Integer> myList = Arrays.asList(num);
		Set<Integer> myTree = new TreeSet<>(myList);
		for(Integer i: myTree) {
			System.out.println(i);
		}
		
		/*
		 * Below is to find index of an any element in TreeSet
		 */
		int v =((TreeSet<Integer>) myTree).headSet(4).size();
		System.out.println(v);
	}

}
