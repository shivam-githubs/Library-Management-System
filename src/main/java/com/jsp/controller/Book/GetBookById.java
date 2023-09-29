package com.jsp.controller.Book;

import com.jsp.servicce.BookService;

public class GetBookById {

	public static void main(String[] args) {
		BookService bookService = new BookService();
		bookService.getBook(1);

	}

}
