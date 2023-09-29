package com.jsp.controller.Librarian;

import com.jsp.servicce.AdminService;


public class ViewAllUnAuthorised {

	public static void main(String[] args) {
		AdminService adminService =new AdminService();
		adminService.viewAllUnAuthorised();
	}

}
