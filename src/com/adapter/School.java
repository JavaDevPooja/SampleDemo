package com.adapter;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pen p = new PenAdapter();
	
		AssignmentWork aw = new AssignmentWork();
		aw.setP(p);
		aw.writeAssignment("I am bit tired to write the assignment");
	}

}
