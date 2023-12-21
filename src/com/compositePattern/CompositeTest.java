package com.compositePattern;

public class CompositeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Component hd = new Leaf(500, "hardDrive");
		Component mouse = new Leaf(300, "mouse");
		Component monitor = new Leaf(5000, "monitor");
		Component cpu = new Leaf(7000, "CPU");
		Component ram = new Leaf(2000, "ram");
		
		Composite ph = new Composite("periphral");
		Composite cabinate = new Composite("cabinate");
		Composite mb = new Composite("motherboard");
		Composite computer = new Composite("computer");
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		
		cabinate.addComponent(hd);
		cabinate.addComponent(mb);
	
		
		computer.addComponent(ph);
		computer.addComponent(cabinate);
		
		computer.showPrice();
	}
	
	

}
