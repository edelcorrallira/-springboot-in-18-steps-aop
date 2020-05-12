package com.in18minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MehtodExecutionCalculatingAspect {
	Logger logger = LoggerFactory.getLogger(UseAccessAspect.class);

	@Around("com.in18minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {//Allows you to continue the execution of the method
		//Start time
		long startTime = System.currentTimeMillis();
		//Allow execution of the method
		joinPoint.proceed();
		//End time
		long endTime = System.currentTimeMillis();
		//Time lapsed
		long transpired = endTime - startTime;
		logger.info("Time ellapsed by {} is {}", joinPoint, transpired);
	}
}
