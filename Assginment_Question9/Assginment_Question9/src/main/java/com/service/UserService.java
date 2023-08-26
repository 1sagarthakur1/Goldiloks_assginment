package com.service;

import com.exceptions.UserException;
import com.models.User;

public interface UserService { 
	public User authanticatUser(String moblie,String pass)throws UserException;
	
	public User addEmployee(User user)throws UserException;
}
