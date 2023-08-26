package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Exception.TestException;
import com.model.Test;
import com.repository.TestRepo;

@Service
public class TestServiceImpl implements TestService
{

	@Autowired
	private TestRepo testRepo;
	
	@Override
	public List<Test> getAllEmployee()throws TestException {
		// TODO Auto-generated method stub
		List<Test> list = testRepo.findAll();
		
		if (list.isEmpty()) {
			throw new TestException("Thare is no any employee");
		}
		return list;
	}

}
