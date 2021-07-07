package com.projecteuler.sagari;

public class WordsInaSentence {
	
	public int noOfWords(String s) {
		
		String[] words = s.split(" ");
		int count = words.length;
		System.out.println(count);
		
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WordsInaSentence w = new WordsInaSentence ();
		w.noOfWords("Alice in wonderland for uds");
	}

}
