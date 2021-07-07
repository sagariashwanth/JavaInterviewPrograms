package com.projecteuler.sagari;

public class Palindrome {

	boolean checkPalindrome(String inputString) {

		char[] plain = inputString.toCharArray();
		int start =0;
		int end = plain.length -1;
		while(end > start){
		    if(plain[end] != plain[start]){
		        return false;
		    }
		    ++start;
		    --end;
		}
		return true;
		}
	public static void main(String[] args) {
		
		Palindrome p = new Palindrome();
		 
		p.checkPalindrome("racecar");

	}

}
