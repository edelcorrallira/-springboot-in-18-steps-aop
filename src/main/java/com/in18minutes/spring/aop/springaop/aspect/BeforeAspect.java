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
	//What kind of method calls do I need to intercept?
	//execution(* PACKAGE.*.*(..))
	@Before("execution(* com.in18minutes.spring.aop.springaop.data.*.*(..))")
	public void before(JoinPoint joinPoint) {
		//What do I do when I intercept the method?
		logger.info("Intercepted Method Calls -> {}", joinPoint);
	}
}
