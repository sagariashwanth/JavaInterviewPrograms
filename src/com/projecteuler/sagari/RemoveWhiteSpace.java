package com.projecteuler.sagari;

public class RemoveWhiteSpace {

	public static void removeSpace(String s) {
		
//		for(int i=0;i<s.length();i++) {
//			
//			char ch = s.charAt(i);
//			if(ch != ' ')
//			{
//				System.out.print(ch);
//			}
//		}
		
		s = s.replaceAll("\\s", "");
		System.out.println(s);
	}
	public static void main(String[] args) {
		
		RemoveWhiteSpace.removeSpace("How Are You");
	}

}
