package com.practice.funcinterface.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//public class ConsumerDemo implements Consumer<Integer>{

	/*
	 * @Override public void accept(Integer t) { System.out.println("Printing: "+t);
	 * 
	 * }
	 */
	public class ConsumerDemo{
		
	public static void main(String[] args) {

		Consumer<Integer> consumer = (t) -> System.out.println("Printing: "+t);
		consumer.accept(1);
		
		List<Integer> numList = Arrays.asList(1,2,3,4,5);
		numList.stream().forEach(consumer);
		

	}

	

}
