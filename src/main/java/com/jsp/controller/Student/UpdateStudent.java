package com.jsp.controller.Student;


import com.jsp.servicce.StudentService;

public class UpdateStudent {
	public static void main(String[] args) {
	
		StudentService studentService = new StudentService();
		studentService.updateStudent(1, "Shivani@", "Shivani");
		
		
	}
}
