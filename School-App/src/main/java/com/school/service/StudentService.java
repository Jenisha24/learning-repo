package com.school.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.entity.StudentEntity;
import com.school.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo studentRepo;

	public StudentEntity addStudent(StudentEntity studentEntity) {
		StudentEntity studentDetails = studentRepo.save(studentEntity);
		return studentDetails;
	}

	public StudentEntity getStudent(int studentId) {
		Optional<StudentEntity> studentDetails = studentRepo.findById(studentId);
		StudentEntity entity = studentDetails.get();
		return entity;
	}

	public StudentEntity editStudent(StudentEntity newDetails) {
		Optional<StudentEntity> oldDetails = studentRepo.findById(newDetails.getStudentId());
//		oldDetails.get().getStudentName();
		oldDetails.get().setStudentName(newDetails.getStudentName());
		oldDetails.get().setStudentAge(newDetails.getStudentAge());
        oldDetails.get().setStudentAddress(newDetails.getStudentAddress());
        oldDetails.get().setDateOfBirth(newDetails.getDateOfBirth());
		StudentEntity studentDetails = studentRepo.save(oldDetails.get());

		return studentDetails;
	}
	
	public String deleteStudent(int studentId) {
//		Optional<StudentEntity> studentDetails= studentRepo.findById(studentId);
//		StudentEntity studentValues=studentDetails.get();
		studentRepo.deleteById(studentId);
        return "Successfully Deleted";
        
		
	}
}
