package com.mmdworks.springcourse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmdworks.springcourse.repo.Dao2;

@Service
public class Business2 {
	
	@Autowired
	Dao2 dao2;
	
	public String calculateSomething() {
		return dao2.retriveSomething();
	}
	

}
