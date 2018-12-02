package com.mmdworks.springcourse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmdworks.springcourse.repo.Dao1;


public class Business1 {
	
	
	Dao1 dao1;
	
	
	
	public Dao1 getDao1() {
		return dao1;
	}



	public void setDao1(Dao1 dao1) {
		this.dao1 = dao1;
	}



	public String calculateSomething() {
		return dao1.retriveSomething();
	}
	
	
}
