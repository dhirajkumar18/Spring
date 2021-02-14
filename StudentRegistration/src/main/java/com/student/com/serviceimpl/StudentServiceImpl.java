package com.student.com.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.com.dao.StudentDao;
import com.student.com.entity.State;
import com.student.com.entity.Student;
import com.student.com.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studDao;
	@Override
	public void registerStudent(Map<String, String> data) {
		String name=data.get("name").toString();
		String course=data.get("course").toString();
		String gender=data.get("gender").toString();
		String address=data.get("address").toString();
		int stateId=Integer.parseInt(data.get("state").toString());
		Student st=new Student();
		State stat=new State();
		stat.setId(stateId);
		st.setStudentName(name);
		st.setAddress(address);
		st.setCourse(course);
		st.setSex(gender);
		st.setAddress(address);
		st.setState(stat);
		studDao.save(st);
		
	}
	@Override
	public List<Student> findAll() {
		List<Student> students=new ArrayList<>();
		students=(List<Student>) studDao.findAll();
		return students;
	}

}
