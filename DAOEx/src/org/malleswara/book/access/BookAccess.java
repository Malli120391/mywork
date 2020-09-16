package org.malleswara.book.access;

import org.malleswara.book.Book;
import org.malleswara.book.impl.BookDaoImpl;
import org.malleswara.bookdao.BookDAO;

public class BookAccess {

	public static void main(String[] args) {

		BookDAO  bookdao = new BookDaoImpl();
		
		for(Book book : bookdao.getAllBooks()){
			System.out.println("Book ISBN : " + book.getIsbn());
		}
		Book book = bookdao.getAllBooks().get(1);
        book.setName("Algorithmes");
        bookdao.saveBook(book);
		
        Book book1 =  bookdao.getAllBooks().get(1);
        book1.setName("J2ee");
        bookdao.updateBook(book1);
        bookdao.getBookByIsbn(1);
        System.out.println("Student: [RollNo : " + book1.getIsbn() + ", Name : " + book.getName() + " ]");
       
        Book book2 = bookdao.getBookByIsbn(2);
        bookdao.delateBook(book2);
        System.out.println("Book is deleted from Book table");
	}

}
