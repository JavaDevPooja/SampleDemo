package com.multiThreading.synchronize;

class Counter{
	
	int count;
	public synchronized void increment() {   // only one thread execute the method at a time
		count++;
	}
}

public class SynchronizeDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Counter c = new Counter();
//		c.increment();
//		System.out.println(c.count);
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0; i<1000; i++) {
					c.increment();
				}
			}
		});
//		t1.start();
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0; i<1000; i++) {
					c.increment();
				}
			}
		});
		t1.start();
		t2.start();
		 t1.join();
		t2.join();
		System.out.println(c.count);
	}

}
