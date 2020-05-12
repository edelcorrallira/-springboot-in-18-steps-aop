package com.in18minutes.spring.aop.springaop.data;

import org.springframework.stereotype.Repository;

import com.in18minutes.spring.aop.springaop.aspect.TrackTime;

@Repository
public class Dao1 {
	@TrackTime
	public String retrieveSomething() {
		return "Dao1";
	}
}
