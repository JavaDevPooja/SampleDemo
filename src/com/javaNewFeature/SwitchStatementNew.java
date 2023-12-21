package com.javaNewFeature;

public class SwitchStatementNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day = "sat";
		
		String result = "";
		
//		result =  switch (day) {
//		case "Monday", "Friday": {
//			
//			yield "9 am";
//		}
//		case "Sat" , "sun": {
//			
//			yield "7 am";
//		}
//		default:
//			yield "8 am";
//		};
		
		switch (day) {
		case "Mon", "Tues" -> System.out.println("8 am");
		case "sat", "sun" -> System.out.println("6 am");
		
		default ->System.out.println("9 am");
		
		}
		
//		System.out.println("Result = " + result);
	}

}
