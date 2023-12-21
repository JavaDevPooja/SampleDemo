package com.multiThreading;

public class RunThread extends Thread{
	int[] values = {3,4,5,6,2,8};
	
	public void run(){
		for(int i=0; i<6; i++) {
			values[i] = values[i] * 2;
			System.out.print(values[i] + " ");
		}
	}
}
