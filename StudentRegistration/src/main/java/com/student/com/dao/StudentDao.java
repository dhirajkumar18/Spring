package com.student.com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.com.entity.Student;

@Repository
public interface StudentDao extends CrudRepository<Student, Integer> {
	public Student findByStudentName(String name);

}
