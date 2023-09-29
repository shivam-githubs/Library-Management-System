package com.jsp.controller.Admin;

import com.jsp.servicce.AdminService;

public class DeleteAdmin {

	public static void main(String[] args) {
		AdminService adminService = new AdminService();
		adminService.deleteAdmin(7);
	}

}
