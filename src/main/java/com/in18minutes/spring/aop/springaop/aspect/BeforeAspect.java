package com.in18minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
@Aspect
@Configuration
public class BeforeAspect {
	Logger logger = LoggerFactory.getLogger(UseAccessAspect.class);
	@Before("execution(* com.in18minutes.spring.aop.springaop..*.*(..))")
	public void before(JoinPoint joinPoint) {
		logger.info("Intercepted Method Calls -> {}", joinPoint);
	}
}
