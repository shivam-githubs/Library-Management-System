package com.jsp.controller.Book;

import com.jsp.dto.Admin;
import com.jsp.dto.Book;
import com.jsp.servicce.AdminService;
import com.jsp.servicce.BookService;

public class SaveBook {

	public static void main(String[] args) {
		Book book =new Book();
		book.setBook("Fiction");
		book.setStatus("Available");
		BookService bookService = new BookService();
		bookService.saveBook(book);
	}

}
