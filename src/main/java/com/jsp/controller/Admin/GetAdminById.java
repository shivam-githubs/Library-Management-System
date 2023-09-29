package com.jsp.controller.Admin;

import com.jsp.servicce.AdminService;

public class GetAdminById {

	public static void main(String[] args) {
		AdminService adminService = new AdminService();
		adminService.getAdmin(5);

	}

}
