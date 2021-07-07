package com.projecteuler.sagari;

public class Multiples {

	public static void main(String[] args) {
	 int sum =0; 
	int[] Array= new int[1000];
	for(int i =0; i<Array.length;i++) {
		if(i%3 ==0 || i%5==0) {
			sum += i;
		}
		
	}
	System.out.println(sum);

	}

}
