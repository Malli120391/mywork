package org.malleswara.bookdao;

import java.util.List;

import org.malleswara.book.Book;

public interface BookDAO {
	
	public List<Book> getAllBooks();
	
	Book getBookByIsbn(int isbn);
	
	public void saveBook(Book book);
	
	public void updateBook(Book book);
	
	public void delateBook(Book book);

}
