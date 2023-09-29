package com.jsp.controller.Admin;

import com.jsp.dto.Admin;
import com.jsp.servicce.AdminService;

public class SaveAdmin {

	public static void main(String[] args) {
		Admin admin =new Admin();
		admin.setUsename("Admin7");
		admin.setPass("Admin7");
		AdminService adminService = new AdminService();
		adminService.saveAdmin(admin);
	}

}
