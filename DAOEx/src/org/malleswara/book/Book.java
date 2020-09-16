package org.malleswara.book;

public class Book {
	private int isbn;
	private String name;
	private String Author;
	private double price;
	
	public Book(){
		
	}
	
	public Book(int isbn, String name, String author, double price) {
		
		this.isbn = isbn;
		this.name = name;
	  this.Author = author;
		this.price = price;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", Author=" + Author
				+ ", price=" + price + "]";
	}
	
	
	

}
