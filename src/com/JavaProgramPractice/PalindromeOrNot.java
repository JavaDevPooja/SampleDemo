package com.JavaProgramPractice;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner s = new Scanner(System.in);
	       String word = s.nextLine();
	       System.out.println("Is "+word+" palindrome? - "+isWordPalindrome(word));

	}
	
	public static boolean isWordPalindrome(String word){ 
	       String reverseWord = getReverseWord(word); 
	       //if word equals its reverse, then it is a palindrome
	       if(word.equals(reverseWord)){ 
	           return true; 
	       } 
	       return false; 
	   } 
	   
	   public static String getReverseWord(String word){ 
	       if(word == null || word.isEmpty()){ 
	           return word; 
	       } 
	       System.out.println("------ "+ word);
	       return word.charAt(word.length()- 1) + getReverseWord(word.substring(0, word.length() - 1)); 
	   } 

}
