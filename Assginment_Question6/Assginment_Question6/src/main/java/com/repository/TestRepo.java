package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Test;

@Repository
public interface TestRepo extends JpaRepository<Test, Integer>{

}
