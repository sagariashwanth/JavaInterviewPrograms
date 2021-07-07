package com.projecteuler.sagari;

import java.util.HashSet;
import java.util.Set;

public class AllUniqueString {

	public static void main(String[] args) {

//		AllUniqueString.isUnique("Alive swum");
//============================================================	
//		String input = "Alive live";
//		AllUniqueString.method2(input);
//		System.out.println(method2(input));
//=============================================================		

		String input = "Alive";
		AllUniqueString.method4(input);
		System.out.println(method4(input));
//=========================================================		
	}
	/*
	 * Method1: using HashSet
	 */
//	static boolean result = false;
//	public static boolean isUnique(String s) {
//		
//		
//		HashSet<Character> mySet = new HashSet<>();
//		for(int i=0;i<s.length();i++) {
//			result = mySet.add(s.charAt(i));
//		
//		if(result == false) {
//			break;
//		}
//		
//		}
//		System.out.println(result);
//		return result;
//		
//=====================================================================================
//	public static boolean method2(String s)
//	{
//		boolean result = false;
//		
//		for(int i=0;i<s.length();i++)
//		{
//			char ch = s.charAt(i);
//			int count =0;
//			for(int j=i; j<s.length();j++)
//			{
//				if(ch == s.charAt(j)) 
//				{
//					count++;
//				}
//			}
//			if(count >1)
//			{
//				return false;
//			}
//			
//		}
//		return true;
//	}
//	==================================================================================

	public static boolean method4(String s) {

		boolean result = false;

		for (char ch : s.toCharArray()) {
			if (s.indexOf(ch) == s.lastIndexOf(ch)) {
				result = true;
			} else {
				result = false;
			}
		}

		return result;

	}

}
