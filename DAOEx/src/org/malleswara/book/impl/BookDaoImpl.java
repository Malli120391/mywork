package org.malleswara.book.impl;

import java.util.ArrayList;
import java.util.List;

import org.malleswara.book.Book;
import org.malleswara.bookdao.BookDAO;

public class BookDaoImpl implements BookDAO {
	
	private List<Book> books;
	
	

	public BookDaoImpl() {
		books = new ArrayList<>();
		books.add(new Book(1,"Java","JemasG", 1000));
		books.add(new Book(2,"Spring","Piovtel", 500));
		books.add(new Book(3,"Hibernate","Hbnt", 400));
		books.add(new Book(4,"Mysql","Oracle", 300));
		books.add(new Book(5,"Reactjs","Fnd", 400));
	}

	@Override
	public List<Book> getAllBooks() {
		return books;
	}

	@Override
	public Book getBookByIsbn(int isbn) {
		return books.get(isbn);
	}

	@Override
	public void saveBook(Book book) {
		books.add(book);

	}

	@Override
	public void updateBook(Book book) {
	 books.get(book.getIsbn()).setName(book.getName());
     System.out.println("Book: Roll No " + book.getIsbn() + ", updated in the database");
	}

	@Override
	public void delateBook(Book book) {
		 books.remove(book);
		 books.remove(book.getIsbn());
		 System.out.println("Book: Roll No " + book.getIsbn() + ", deleted from database");

	}

}
