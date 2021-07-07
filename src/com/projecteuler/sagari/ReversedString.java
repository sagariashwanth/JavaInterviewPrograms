package com.projecteuler.sagari;

public class ReversedString {

	public static void main(String[] args) {

		String input = "Hi Java!";
		char[] ch = input.toCharArray();
		int left = 0;
		int right = ch.length - 1;
		for (left = 0; left < right; left++, right--) {

			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
		}
		
		for(char c: ch) {
			System.out.print(c);
		}

	}

}
