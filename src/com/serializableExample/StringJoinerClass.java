package com.serializableExample;

import java.util.StringJoiner;

public class StringJoinerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj = new StringJoiner(",", "{","}");
		sj.add("Pooja").add("Ankit").add("Bittu");
		System.out.println(sj.toString());
		StringJoiner sj1 = new StringJoiner(":");
		sj1.add("Shona").add("Pnkit");
		System.out.println(sj1.toString());
		
		sj.merge(sj1);
		System.out.println(sj.toString());
		String st = null;
//		System.gc();
	}
	
	public void finalize() {
	System.out.println("finalize called");
		} 
    
	public static void main(int[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj = new StringJoiner(",");
		sj.add("Pooja").add("Ankit").add("Bittu");
		System.out.println(sj.toString());
		StringJoiner sj1 = new StringJoiner(":");
		sj1.add("Shona").add("Pnkit");
		System.out.println(sj1.toString());
		
		sj.merge(sj1);
		System.out.println(sj.toString());
	}
	
	public static void main(double[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj = new StringJoiner(",");
		sj.add("Pooja").add("Ankit").add("Bittu");
		System.out.println(sj.toString());
		StringJoiner sj1 = new StringJoiner(":");
		sj1.add("Shona").add("Pnkit");
		System.out.println(sj1.toString());
		
		sj.merge(sj1);
		System.out.println(sj.toString());
	}

}
