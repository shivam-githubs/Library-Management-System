package com.jsp.controller.Book;

import com.jsp.servicce.LibrarianService;

public class ReturnBook {

	public static void main(String[] args) {
			LibrarianService librarianService = new LibrarianService();
			librarianService.returnBookById(5);
		}

}
