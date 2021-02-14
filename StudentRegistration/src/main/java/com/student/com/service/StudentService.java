package com.student.com.service;

import java.util.List;
import java.util.Map;

import com.student.com.entity.Student;

public interface StudentService {
	void registerStudent(Map<String,String> data);
	public List<Student> findAll();
}
