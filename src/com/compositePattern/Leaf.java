package com.compositePattern;

public class Leaf implements Component{

	int price;
	String name;
	
	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		System.out.println(name + " : " + price);
	}

}
