package com.practice.java8;

interface Calculator{
	
//	void calc();
	
//	void sum(int num);
	
	int subtract(int i1,int i2);
}

public class CalculatorLambda {

	public static void main(String[] args) {
		
		/*Calculator calculator =() -> System.out.println("Hi lambda");
		calculator.calc();*/
		
		/*
		 * Calculator calculator = (num) -> System.out.println(num);
		 * calculator.sum(443);
		 */
		
		Calculator calculator = (i1, i2)-> i2 -i1;
		System.out.println(calculator.subtract(2, 7));
		

	}

}
