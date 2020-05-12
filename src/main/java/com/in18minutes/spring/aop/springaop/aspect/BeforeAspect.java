package com.in18minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {
	Logger logger = LoggerFactory.getLogger(UseAccessAspect.class);
	//This now stands in contrast with other Aspects; it no longer has a centralized definition
	// it could be fixed substituting: com.in18minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.mainLayerExecution()
	@Before("execution(* com.in18minutes.spring.aop.springaop..*.*(..))")
	public void before(JoinPoint joinPoint) {
		logger.info("Intercepted Method Calls -> {}", joinPoint);
	}
}
