package com.builder;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Phone ph = new Phone("Android", 2, "Qualcomm", 5.5, 2300);
//		System.out.println(ph.toString());
		
		Phone ph = new PhoneBuilder().setOs("Android").setRam(2).getPhone();
		System.out.println(ph.toString());
	}

}
