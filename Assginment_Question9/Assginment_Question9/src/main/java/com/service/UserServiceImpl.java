package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exceptions.UserException;
import com.models.User;
import com.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User authanticatUser(String moblie, String pass) throws UserException {
		// TODO Auto-generated method stub
		User user = userRepo.findByMobileNo(moblie);
		if(user == null) {
			throw new UserException("No any User with This number");
		}
		
		if(!user.getPassword().equals(pass)) {
			throw new UserException("Invalid password");
		}
		
		return user;
	}

	@Override
	public User addEmployee(User user) throws UserException {
		// TODO Auto-generated method stub
		User user2 = userRepo.save(user);
		
		return user2;
	}

}
