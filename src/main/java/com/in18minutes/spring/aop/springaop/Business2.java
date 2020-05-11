package com.in18minutes.spring.aop.springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {
	@Autowired
	private Dao1 dao2;
	
	public String calculateSomething() {
		return dao2.retrieveSomething();
	}
}
