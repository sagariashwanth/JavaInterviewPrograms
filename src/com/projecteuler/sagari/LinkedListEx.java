package com.projecteuler.sagari;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("A");
		ll.add("A");
		ll.addFirst("B");
		ll.addLast("C");
		
		Iterator it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}



	}

}
