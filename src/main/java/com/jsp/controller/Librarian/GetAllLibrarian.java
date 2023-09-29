package com.jsp.controller.Librarian;

import com.jsp.servicce.LibrarianService;

public class GetAllLibrarian {

	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		librarianService.getAllLibrarian();
	}
}
