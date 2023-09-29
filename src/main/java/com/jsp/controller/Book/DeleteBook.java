package com.jsp.controller.Book;

import com.jsp.servicce.BookService;

public class DeleteBook {

	public static void main(String[] args) {
		BookService bookService = new BookService();
		bookService.deleteBook(2);
	}

}
