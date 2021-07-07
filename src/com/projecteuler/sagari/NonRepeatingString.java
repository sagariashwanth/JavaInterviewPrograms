package com.projecteuler.sagari;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonRepeatingString {

	static char firstNotRepeatingCharacter(String s) {

		/*
		 * Method1: //
		 */
//	    if(s.length() < 1 || s.length()>10) {
//	    	System.out.println("Please enter a valid string");
//	    }
//	    
//	    for(char i : s.toCharArray()) {
//	    	if(s.indexOf(i) == s.lastIndexOf(i)) {
//	    		System.out.println("First non-repeating character is :" +i);
//	    		break;
//	    	}
//	    }
////	    }*/
//		/*
//		 * Method2: Using Stream
//		 */
//		return 0;

		/*
		 * Map<Character,Integer> map = new LinkedHashMap(); for (Character ch :
		 * s.toCharArray()) { map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1); }
		 * return map.entrySet().stream().filter(x -> x.getValue() ==
		 * 1).findFirst().get().getKey();
		 * 
		 * 
		 * }
		 */
		/*
		 * Method 3: LinkedHashMap
		 */

//		HashMap<Character,Integer> map = new LinkedHashMap<>();
//		for(int i=0; i<s.length();i++) {
//		Character ch = s.charAt(i);	
//		if(map.containsKey(ch)) {
//			map.put(ch, map.get(ch)+ 1);
//		}
//		else {
//			map.put(ch, 1);
//		}
//		}
//		
//		
//		
//		for (Character c: map.keySet()) {
//			if (map.get(c) == 1) {
//				return c;
//			}
//		}
//		
//		for(Entry<Character,Integer> entry: map.entrySet()) {
//			if(entry.getValue() ==1) {
//				return entry.getKey();
//			}
//		}
//		return '_';

		Set<Character> mySet = new HashSet<>();
		Set<Character> repeatingChars = new HashSet<>();
		for (Character i : s.toCharArray()) {
			boolean isNewChar = mySet.add(i);
			if (!isNewChar) {
				repeatingChars.add(i);
			}
		}
		
		mySet.removeAll(repeatingChars);
		return mySet.iterator().next();
	}

	public static void main(String[] args) {

		String s = "abbaaadc";

		char ch = firstNotRepeatingCharacter(s);

		System.out.println(ch);

	}

}
