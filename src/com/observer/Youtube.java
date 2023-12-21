package com.observer;

public class Youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Channel telusku = new Channel();
		
		Subscriber s1 = new Subscriber("Ankit");
		Subscriber s2 = new Subscriber("Pooja");
		Subscriber s3 = new Subscriber("Pnkit");
		Subscriber s4 = new Subscriber("AP");
		Subscriber s5 = new Subscriber("AnkitPooja");
		
		s1.subscribeChannel(telusku);
		s2.subscribeChannel(telusku);
		s3.subscribeChannel(telusku);
		s4.subscribeChannel(telusku);
		s5.subscribeChannel(telusku);
		
		telusku.subscribe(s1);
		telusku.subscribe(s2);
		telusku.subscribe(s3);
		telusku.subscribe(s4);
		telusku.subscribe(s5);
		
		telusku.unsubscribe(s5);
		
		telusku.upload("Advance java");
	}

}
