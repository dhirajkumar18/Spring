package com.student.com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.com.entity.State;
@Repository
public interface StateDao extends CrudRepository<State, Integer> {
	

}

