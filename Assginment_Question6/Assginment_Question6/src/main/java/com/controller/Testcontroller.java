package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Exception.TestException;
import com.model.Test;
import com.service.TestService;

@Controller
@RequestMapping("/Test")
public class Testcontroller {
	
	@Autowired
	private TestService testService;
	
	@GetMapping("/getAllEmployee")
	public ResponseEntity<List<Test>> getEmployee() throws TestException{
		List<Test> tests = testService.getAllEmployee();
		return new ResponseEntity<>(tests,HttpStatus.OK); 
	}
}
