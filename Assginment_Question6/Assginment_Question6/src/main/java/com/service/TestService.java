package com.service;

import java.util.List;

import com.Exception.TestException;
import com.model.Test;

public interface TestService {
	public List<Test> getAllEmployee() throws TestException;
}
