package com.student.com.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.com.dao.StateDao;
import com.student.com.entity.State;
import com.student.com.service.StateService;
@Service
public class StateServiceImpl implements StateService {

	@Autowired
	private StateDao stateDao;
	@Override
	public List<State> getAllState() {
		List<State> stateList=new ArrayList<State>();
		stateList = (List<State>) stateDao.findAll();
		return stateList;
	}

}
