package com.projecteuler.sagari;

public class StringPermutation {

	static void permutation(String ans, String str) {

		if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
  
        for (int i = 0; i < str.length(); i++) {
  
            // ith character of str
            char ch = str.charAt(i);
  
            // Rest of the string after excluding 
            // the ith character
            String restOfString = str.substring(0, i) + str.substring(i + 1);
  
            // Recurvise call
            permutation(ans + ch, restOfString);
        }
//		================================================================

//	public static String swapString(String a, int i, int j) {
//		char[] b = a.toCharArray();
//		char ch;
//		ch = b[i];
//		b[i] = b[j];
//		b[j] = ch;
//		return String.valueOf(b);
//	}
//
//	// Function for generating different permutations of the string
//	public static void generatePermutation(String str, int start, int end) {
//		// Prints the permutations
//		if (start == end - 1)
//			System.out.println(str);
//		else {
//			for (int i = start; i < end; i++) {
//				// Swapping the string by fixing a character
//				str = swapString(str, start, i);
//				// Recursively calling function generatePermutation() for rest of the characters
//				generatePermutation(str, start + 1, end);
//				// Backtracking and swapping the characters again.
//				str = swapString(str, start, i);
//			}
//		}
	}

	public static void main(String[] args) {
		String s = "abc";
		permutation("", s);
//		=========================================

//		{
//			String str = "ABC";
//			int len = str.length();
//			System.out.println("All the permutations of the string are: ");
//			generatePermutation(str, 0, len);
//		}

	}
}
