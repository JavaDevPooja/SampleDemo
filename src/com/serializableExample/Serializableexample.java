package com.serializableExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable{
	private static final long serialVersionUId = 132384L;
	final transient int a = 2;
	static int b;
	String name;
	int age;
	 
	public Emp(String name, int age, int b) {
		this.name = name;
		this.age = age;
//		this.a = a;
		this.b = b;
	}
}

public class Serializableexample {

	public static void printdata(Emp object) {
		System.out.println("name = " + object.name);
		System.out.println("age = " + object.age);
		System.out.println("a = " + object.a);
		System.out.println("b = " + object.b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp object = new Emp("abc", 20, 2000);
		String fileName = "xyz.txt";
		try {
			
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(object);
			
			out.close();
			file.close();
			
			System.out.println("Object ahs been serialized and Data before Serialization");
			
			printdata(object);
			
		}catch (IOException e) {
			System.out.println("IOException is caught");
			// TODO: handle exception
		}
		
		object = null;
		object.b = 1000;
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			object = (Emp) in.readObject();
			
			in.close();
			file.close();
			
			System.out.println("Obhect has been deserialized , Data after deserializaton");
			
			printdata(object);
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("Ioexception caught");
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			
			System.out.println("Class not found exception caught");
		}
		
	}

}
