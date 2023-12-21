package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{

	private String shopname;
	
	private List<Book> books = new ArrayList<>();

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "BookShop [shopname=" + shopname + ", books=" + books + "]";
	}
	
	public void loadBook() {
		for(int i = 1; i<10; i++) {
			Book b = new Book();
			b.setBid(i);
			b.setName("book" + i);
			getBooks().add(b);
		}
	}

	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop shop = new BookShop();    //  deep cloning
		for(Book b : this.getBooks()) {
			shop.getBooks().add(b);
		}
		return shop;
	}
	
}
