package com.in18minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
@Aspect
@Configuration
public class AfterAspect {
	Logger logger = LoggerFactory.getLogger(UseAccessAspect.class);
	
	@AfterReturning(value="execution(* com.in18minutes.spring.aop.springaop.business.*.*(..))",
			returning="result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		logger.info("{} returned with value {}", joinPoint, result);
	}

	//No exceptions are currently thrown, this is an illustrative example only
	@AfterThrowing(value="execution(* com.in18minutes.spring.aop.springaop.business.*.*(..))",
			throwing="result")
	public void afterThrowing(JoinPoint joinPoint, Object exception) {
		logger.info("{} returned with value {}", joinPoint, exception);
	}
}
