package com.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.entity.StudentEntity;
import com.school.service.StudentService;


@RestController
@RequestMapping("/school")
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@PostMapping(value = "/student/add")
	public StudentEntity saveStudent(@RequestBody StudentEntity studentEntity) {
		StudentEntity studentDetails = studentService.addStudent(studentEntity);
		return studentDetails;
	}
		
	@GetMapping("/student/get/{studentId}")
	public StudentEntity getStudent(@PathVariable int studentId) {
		StudentEntity studentDetails = studentService.getStudent(studentId);
		return studentDetails;

	}
	
	@PutMapping("/student/edit")
	public StudentEntity editStudent(@RequestBody StudentEntity newDetails) {
		StudentEntity studentDetails = studentService.editStudent(newDetails);
		return studentDetails;
	}
	
	@DeleteMapping("/student/delete/{studentId}")
	public String deleteStudent(@PathVariable int studentId) {
		String studentDetails=studentService.deleteStudent(studentId);
		return studentDetails;
		
	}
	
}
