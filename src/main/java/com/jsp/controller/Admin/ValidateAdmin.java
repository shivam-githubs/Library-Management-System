package com.jsp.controller.Admin;

import com.jsp.servicce.AdminService;

public class ValidateAdmin {

	public static void main(String[] args) {
		AdminService adminService =new AdminService();
		adminService.validateAdmin(2, "Admin2", "Admin2");
		
	}

}
