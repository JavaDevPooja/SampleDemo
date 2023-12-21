package com.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	String title;
	private List<Subscriber> subs = new ArrayList<>();
	
	@Override
	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}
	
	@Override
	public void unsubscribe(Observer sub) {
		subs.remove(sub);
	}
	
	@Override
	public void notifySubscriber() {
		for(Observer sub : subs) {
			sub.update();
		}
	}
	
	@Override
	public void upload(String title) {
		this.title = title;
		notifySubscriber();
	}
}
