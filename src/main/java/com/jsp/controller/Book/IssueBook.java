package com.jsp.controller.Book;

import com.jsp.servicce.LibrarianService;

public class IssueBook {

	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		boolean res = librarianService.issueBookById(1, 5, 1);
		System.out.println(res);
	}

}
