package com.jsp.controller.Admin;

import com.jsp.servicce.AdminService;

public class GetAllAdmin {

	public static void main(String[] args) {
		AdminService adminService = new AdminService();
		adminService.getAllAdmin();
	}
}
