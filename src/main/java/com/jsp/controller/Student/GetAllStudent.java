package com.jsp.controller.Student;

import com.jsp.servicce.StudentService;

public class GetAllStudent{

	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		studentService.getAllStudent();
	}
}
