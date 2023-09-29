package com.jsp.controller.Student;

import com.jsp.dto.Student;
import com.jsp.servicce.StudentService;

public class SaveStudent {

	public static void main(String[] args) {
		Student student =new Student();
		student.setName("shivam");
		student.setEmail("shivam@");
		StudentService studentService = new StudentService();
		studentService.saveStudent(student);
		
	}

}
