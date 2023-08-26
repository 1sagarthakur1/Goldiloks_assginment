package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.User;
import java.util.List;


@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	public User findByMobileNo(String mobileNo);
}
