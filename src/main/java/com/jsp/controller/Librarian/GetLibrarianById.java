package com.jsp.controller.Librarian;

import com.jsp.servicce.AdminService;
import com.jsp.servicce.LibrarianService;

public class GetLibrarianById {

	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		librarianService.getLibrarian(5);

	}

}
