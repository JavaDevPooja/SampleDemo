package com.multiThreading;

class Hii extends Thread{
	
	public void run() {
		for(int i = 0 ; i<5 ; i++) {
			System.out.println("hi");
			try { Thread.sleep(500); } catch(Exception e) {};
		}
	}
}

class Helloo extends Thread{
	public void run() {
		for(int i = 0 ; i<5 ; i++) {
			System.out.println("hello");
			try { Thread.sleep(500); } catch(Exception e) {};
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hii obj1 = new Hii();
		Helloo obj2 =  new Helloo();
		
		obj1.start();
		try { Thread.sleep(10); } catch(Exception e) {};
		obj2.start();
	}

}
