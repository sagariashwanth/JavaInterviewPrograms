package com.projecteuler.sagari;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {
	
	public static String reverseString(String s) {
		
		/* //Method1: using charArray
		char[] c = s.toCharArray();
		for(int i = c.length -1;i>=0;i--) {
			System.out.print(c[i]);
		}
		*/
		/*//Method2: using StringBuilder as it has inbuilt reverse function.
		StringBuilder new_input = new StringBuilder();
		new_input.append(s);
		new_input.reverse();
		for(int i=0; i < s.length();i++) {
			System.out.print(new_input.charAt(i));
		}
		*/
		
		/*//using linkedlist as collections has inbuilt reverse
		char[] c = s.toCharArray();
	    List<Character> myList = new LinkedList<>();
	    for(char e: c ) {
	    	myList.add(e);
	    }
	    Collections.reverse(myList);
	    ListIterator it = myList.listIterator();
	    while(it.hasNext()) {
	    	System.out.print(it.next());
	    }
	    */
		
		// Method4: using recursion
		if(s.isEmpty()) {
			return s;
		}
		
		return reverseString(s.substring(1))+ s.charAt(0);
		
		
		
		
	}

	public static void main(String[] args) {
		
//		ReverseString result = new ReverseString();
//		result.reverseString("Hello Java");
		
		String s = "Hello Java";
		String reversed = reverseString(s);
		System.out.println(reversed);
	}

}
