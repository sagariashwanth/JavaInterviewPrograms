package com.projecteuler.sagari;

public class LargestArrayProduct {
	
	int product ;
	int adjacentElementsProduct(int[] inputArray) {

		for(int i=0; i<inputArray.length;i++){
		     product = inputArray[i] * inputArray[i +1];
		}
		return product;
		}


	public static void main(String[] args) {
		
		LargestArrayProduct prod= new LargestArrayProduct();
		
		int[] inputArray = [3, 6, -2, -5, 7, 3];
		
		prod.adjacentElementsProduct(inputArray);

	}

}
