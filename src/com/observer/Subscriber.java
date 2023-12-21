package com.observer;

public class Subscriber implements Observer {

	private String name;
	private Channel channel;
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void update() {
		System.out.println("Hey " + name + " video uploaded : " + channel.title);
	}
	
	@Override
	public void subscribeChannel(Channel ch) {
		channel = ch;
	}
}
