package com.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	String name;
	List<Component> components = new ArrayList<>();
	
	public Composite(String name) {
		super();
		this.name = name;
	}
	
	public void addComponent(Component com) {
		components.add(com);
	} 
	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		System.out.println(name);
		for(Component com : components) {
			com.showPrice();
		}
	}

}
