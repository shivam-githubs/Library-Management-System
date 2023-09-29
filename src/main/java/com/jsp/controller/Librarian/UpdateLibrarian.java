package com.jsp.controller.Librarian;

import com.jsp.servicce.LibrarianService;

public class UpdateLibrarian {
	public static void main(String[] args) {
	
		LibrarianService librarianService = new LibrarianService();
		librarianService.updateLibrarian(1, "lib1@");
		
	}
}
