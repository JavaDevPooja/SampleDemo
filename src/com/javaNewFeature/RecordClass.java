package com.javaNewFeature;

import java.util.Objects;

//class Alien{
//	int id;
//    String name;
//    
//	public Alien(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	@Override
//	public String toString() {
//		return "Alien [id=" + id + ", name=" + name + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Alien other = (Alien) obj;
//		return id == other.id && Objects.equals(name, other.name);
//	}
//	
//}

record Alien(int id, String name) {    // field is by default private and final  , this cannnot extends another class, but implements interface
//	public Alien () {
//		this(0, "");
//	}

	public Alien(int id , String name) {
		
		if(id == 0) {
			throw new IllegalArgumentException("Id should not be 0 ");
		}
		
		this.id = id;
		this.name = name;
	}
}

public class RecordClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alien a1 =  new Alien(1, "Pooja");
		Alien a2 = new Alien(9, "Pooja");
		
//		Alien a3 = new Alien();
		
		System.out.println(a1.name());
		
		
		System.out.println(a1.equals(a2));
		System.out.println(a2);
		
	}

}
