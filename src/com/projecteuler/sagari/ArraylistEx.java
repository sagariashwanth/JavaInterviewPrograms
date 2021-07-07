package com.projecteuler.sagari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistEx {

	public static void main(String[] args) {
		
		ArrayList<String> myArr = new ArrayList<>(Arrays.asList("sasha","achu","yash"));
		myArr.forEach((name)->{
		System.out.println(name);
		
		
		});

		System.out.println("*************************");
		Collections.sort(myArr);
		myArr.forEach((n)-> {
			System.out.println(n);

	});
		
		Collections.sort(myArr, Collections.reverseOrder());
		myArr.forEach((r)->{
			System.out.println(r);
		});

}
}
