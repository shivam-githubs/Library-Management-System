package com.jsp.controller.Admin;

import com.jsp.servicce.AdminService;

public class AdminApproveLibrarian {

	public static void main(String[] args) {
		
		AdminService adminService =new AdminService();
		adminService.approveLibrarianById(1, 4);

	}

}
