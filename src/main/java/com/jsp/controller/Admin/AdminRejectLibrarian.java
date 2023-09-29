package com.jsp.controller.Admin;

import com.jsp.servicce.AdminService;

public class AdminRejectLibrarian {

	public static void main(String[] args) {
		AdminService adminService =new AdminService();
		adminService.rejectLibrarianById(7, 6);
	}

}
