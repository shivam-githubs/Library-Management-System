package com.jsp.controller.Admin;

import com.jsp.servicce.AdminService;

public class UpdateAdmin {
	public static void main(String[] args) {
	
		AdminService adminService = new AdminService();
		adminService.updateAdminPass(1, "Admin1");
		adminService.updateAdminUsername(1, "Admin1");
		
	}
}
