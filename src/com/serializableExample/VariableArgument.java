package com.serializableExample;

public class VariableArgument {

	public static void printData(String... info) {
		for (String string : info) {
			System.out.println(string + " ");
		}
//		System.out.println(info.toString());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printData("pooja", "ankit","biitu","shona");
		
		printData(new String[]{"pooja", "ankit","biitu","shona"});
		System.out.println(1.0/0.0);
	}

}
