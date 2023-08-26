package com.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "userGenerator")
    @SequenceGenerator(name = "userGenerator",sequenceName = "usergen",allocationSize = 1,initialValue = 1)
	private int userid;
	
	private String userName;
	
	@Size(max = 100,message = "Address should be less then 100 Characters")
	private String address;
	
	@Min(value = 1,message = "Please Eneter right age")
	private int age;
	
	@Size(min = 10,max = 10,message = "please Enter right mobile number")
	@Column(unique = true)
	private String mobileNo;
	
	@Size(min = 6,max = 10,message = "please Enter right password")
	private String password;

}
