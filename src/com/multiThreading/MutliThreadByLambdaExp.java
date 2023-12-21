package com.multiThreading;

public class MutliThreadByLambdaExp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		Runnable r1 = ()->     //lambda expression
//				// TODO Auto-generated method stub
//				{
//					for(int i = 0 ; i<5 ; i++) {
//					System.out.println("hi");
//					try { Thread.sleep(500); } catch(Exception e) {};
//				}
//			};
//		
//		Runnable r2 = ()-> {
//				// TODO Auto-generated method stub
//				for(int i = 0 ; i<5 ; i++) {
//					System.out.println("hello");
//					try { Thread.sleep(500); } catch(Exception e) {};
//				}
//		};
//		
		Thread t1 = new Thread(()->     //lambda expression
		// TODO Auto-generated method stub
		{
			for(int i = 0 ; i<5 ; i++) {
			System.out.println("hi Shona" + Thread.currentThread().getPriority());
			try { Thread.sleep(500); } catch(Exception e) {};
		}
	}, "Hi Thread");
		Thread t2 = new Thread(()-> {
			// TODO Auto-generated method stub
			for(int i = 0 ; i<5 ; i++) {
				System.out.println("hello Shona");
				try { Thread.sleep(500); } catch(Exception e) {};
			}
	}, "Hello Thread");
		
//		t1.setName("Hi Shona Thread");        //set the name of thread
//		t2.setName("Hello Shona Thread");
//		
//		System.out.println(t1.getName());
//		System.out.println(t2.getName());
		
		t1.setPriority(Thread.MAX_PRIORITY);    // get the priority of thread , higher the number higher the property
		t2.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.start();
		try { Thread.sleep(10); } catch(Exception e) {};
		t2.start();
		
		System.out.println(t2.isAlive());
		
		t1.join();   // It says main  thread to wait untill t1 and t2 complete their job
		t2.join();
		
		System.out.println(t1.isAlive());  // to check the thread is in running state or not
		
		System.out.println(t2.isAlive());
		
		System.out.println("Byeeeee");
	}

}
