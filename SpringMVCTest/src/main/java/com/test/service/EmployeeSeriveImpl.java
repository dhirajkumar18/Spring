package com.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeSeriveImpl implements EmployeeService{

	public List getAllEmployeeList() {
		List list=new ArrayList<String>();
		list.add("dhiraj");
		list.add("subham");
		list.add("anita");
		list.add("naveen");
		return list;
	}

}
