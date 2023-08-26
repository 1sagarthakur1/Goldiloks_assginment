package com.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exceptions.UserException;
import com.models.User;
import com.service.UserService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/authentication/{moblie}/{password}")
	public ResponseEntity<User> forUserauthentication(@Valid @PathVariable("moblie") String moblie,@PathVariable("password") String pass) throws UserException{
		User user = userService.authanticatUser(moblie, pass);
		return new ResponseEntity<>(user,HttpStatus.OK);
	};
	
	@PostMapping("/addUser")
	public ResponseEntity<User> foraddUser(@Valid @RequestBody User user) throws UserException{
		User user1 = userService.addEmployee(user);
		return new ResponseEntity<>(user1,HttpStatus.OK);
	};

}
