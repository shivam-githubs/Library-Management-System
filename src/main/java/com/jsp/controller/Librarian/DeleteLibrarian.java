package com.jsp.controller.Librarian;

import com.jsp.servicce.AdminService;
import com.jsp.servicce.LibrarianService;

public class DeleteLibrarian {

	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		librarianService.deleteLibrarian(9);
	}

}
