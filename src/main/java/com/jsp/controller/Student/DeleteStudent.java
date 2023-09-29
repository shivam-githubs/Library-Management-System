package com.jsp.controller.Student;


import com.jsp.servicce.StudentService;

public class DeleteStudent {

	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		studentService.deleteStudent(7);
	}

}
