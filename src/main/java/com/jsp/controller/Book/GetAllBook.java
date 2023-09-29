package com.jsp.controller.Book;

import com.jsp.servicce.BookService;

public class GetAllBook {

	public static void main(String[] args) {
		BookService bookService = new BookService();
		bookService.getAllBook();
	}
}
