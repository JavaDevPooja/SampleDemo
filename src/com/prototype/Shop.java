package com.prototype;

public class Shop {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop bs = new BookShop();
		bs.setShopname("Novell");
		bs.loadBook();
		System.out.println(bs.toString());
		
		BookShop bs1 = bs.clone();     // shallow cloning
		bs1.setShopname("AtoZ");
		System.out.println(bs1.toString());
		
		bs.getBooks().remove(3);
		System.out.println("------------------------------------------");
		System.out.println(bs.toString());
		System.out.println(bs1.toString());
	}

}
