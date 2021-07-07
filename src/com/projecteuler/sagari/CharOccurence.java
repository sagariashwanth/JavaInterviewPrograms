package com.projecteuler.sagari;

import java.util.HashMap;

public class CharOccurence {
	
	
	
	public static void countChar(String s) {
		
//		HashMap<Character,Integer> map =new HashMap<>();
//		
//		for(int i =0;i< s.length();i++) {
//			if(map.containsKey(s.charAt(i))) {
//				map.put(s.charAt(i), map.get(s.charAt(i))+1);
//			
//			}
//			else {
//				map.put(s.charAt(i), 1);
//				
//			}		
//		}
//		System.out.println(map);
//		=========================================================
		 char[] myArr ;
		 
		 do {
			 myArr = s.toCharArray();
			 char ch = myArr[0];
			 int count =1;
			 for(int i=1; i<myArr.length;i++) {
				 if(ch == myArr[i]) {
					 count++;
				 }
			 }
			 if(((ch != ' ') && (ch != '\t'))){
			 System.out.println(ch + " "+ count);
			 }
			// replace all occurrence of the character 
		      // which is already counted
		      s = s.replace(""+ch, "");
			 if(s.length() ==0) {
				 break;
			 }
			 
		 }while(myArr.length > 1);
		      
	}

	public static void main(String[] args) {
		
		CharOccurence.countChar("Alive is");
		
		


	}

}
