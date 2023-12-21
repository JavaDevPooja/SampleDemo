package com.javaInterviewQuestion;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//	    System.out.println("  Please  enter  the  input  string  :");
//	    Scanner in = new Scanner(System.in);    // read from System input
//	    String input = in.nextLine();
//	    Character firstNonRepeatedChar = logic(input);
//	    System.out.println("The  first  non  repeated  character  is  :    " + firstNonRepeatedChar);
//	    in.close();
	    

        // S1 refers to Object in the Heap Area
        // Line-1
        String s1 = new String("GFG");
 
        // S2 now refers to Object in SCP Area
        // Line-2
        String s2 = "GFG";
//        String s2 = s1.concat("GFG");
 
//        System.out.println(s2);
        // S3 refers to Object in SCP Area
        // Line-3
        String s3 = "GFG";
 
        System.out.println(s2 == s3);
        
        System.out.println(s1.equals(s3));
        
        System.out.println(s1.intern() == s3.intern());
 
        // S4 refers to Object in the SCP Area
        // Line-4
        String s4 = "GFGGFG";
 
//        System.out.println(s3 == s4);
	}
//
//	 private static Character logic(String input) {  
//	        Character result =  input.chars()           // IntStream
//	             .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))  // convert to lowercase & then to Character object Stream
//	             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // store in a LinkedHashMap with the count
//	             .entrySet().stream()                       // EntrySet stream
//	             .filter(entry -> entry.getValue() == 1L)   // extracts characters with a count of 1
//	             .map(entry -> entry.getKey())              // get the keys of EntrySet
//	             .findFirst().get();                        // get the first entry from the keys
//	        
//	         return result;    
//	  }
}
