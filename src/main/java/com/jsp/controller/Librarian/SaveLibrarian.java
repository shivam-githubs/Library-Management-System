package com.jsp.controller.Librarian;

import com.jsp.dto.Librarian;

import com.jsp.servicce.LibrarianService;

public class SaveLibrarian {

	public static void main(String[] args) {
		Librarian librarian =new Librarian();
		librarian.setName("Lib9");
		librarian.setEmail("lib9@");
		librarian.setStatus("Authorized");
		LibrarianService librarianService = new LibrarianService();
		librarianService.saveLibrarian(librarian);
	}

}
