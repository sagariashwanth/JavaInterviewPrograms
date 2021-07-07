package com.projecteuler.sagari;

import java.util.HashMap;

public class AnagramStrings {
	
	public static boolean isAnagram(String str1, String str2) {
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
//		Arrays.sort(ch1);
//		Arrays.sort(ch2);
//		
//		return Arrays.equals(ch1, ch2);
		
//		======================================
				
//		for(char c: ch1) {
//			int index= str2.indexOf(c);
//		
//		if(index == -1) {
//			return false;
//		}
//		
//		}
//		return true;
//		==============================================
		
		
		HashMap map1 = createHashMap(str1);
		HashMap map2 = createHashMap(str2);
		if(map1.equals(map2)) {
			System.out.println("isAnagram");
		}
		else {
			System.out.println("not an anagram");
		}
		return false;
		
	}
		
		
		
		
		
		public static HashMap createHashMap(String str) {
		HashMap map = new HashMap();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				int count = (int) map.get(str.charAt(i));
				map.put(str.charAt(i),count + 1);
			}
			else{
				map.put(str.charAt(i), 0);
			}
		}
			return map;
		
	}

	
	public static void main(String[] args) {
		
		boolean result = isAnagram("rome", "omr");
		System.out.println(result);
		

	}

}
