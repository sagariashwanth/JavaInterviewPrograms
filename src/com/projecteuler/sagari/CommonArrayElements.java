package com.projecteuler.sagari;

import java.util.HashSet;
import java.util.Set;

public class CommonArrayElements {

	public static void commonElements(String[] arr1, String[] arr2) {
		
//		Set<String> mySet = new HashSet<>();
//		for(int i=0; i< arr1.length;i++) {
//			for(int j=0;j<arr2.length;j++) {
//				if(arr1[i] == arr2[j]) {
//					mySet.add(arr1[i]);
//					break;
//				}
//				
//			}
//		}
//		for(String i: mySet)
//			System.out.println(i);
//		=======================================================
		
//		Set<String> mySet1 = new HashSet<>();
//		Set<String> mySet2 = new HashSet<>();
//		
//		for(String i : arr1) {
//			mySet1.add(i);
//		}
//		for(String i: arr2) {
//			mySet2.add(i);
//		}
//		
//		mySet1.retainAll(mySet2);
//		System.out.println(mySet1);
//		==========================================================
		
		Set<String> mySet = new HashSet<>();
		for(int i=0; i<arr1.length;i++) {
			mySet.add(arr1[i]);
		}
		for(int j=0;j<arr2.length;j++) {
		if(mySet.contains(arr2[j])) {
			System.out.println(arr2[j]);
		}
		}
	}

	public static void main(String[] args) {
		
		String[] arr1 = {"Geeks","1","Hi"};
		String[] arr2 = {"Geeks","1","lo"};
		
		CommonArrayElements.commonElements(arr1,arr2);
		
	}
	}

