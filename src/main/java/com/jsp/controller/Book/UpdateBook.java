package com.jsp.controller.Book;

import com.jsp.servicce.AdminService;
import com.jsp.servicce.BookService;

public class UpdateBook {
	public static void main(String[] args) {
	
		BookService bookService = new BookService();
		bookService.updateStudent(1, "Tech", "Not");
		
	}
}
