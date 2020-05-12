package com.in18minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	@Pointcut("execution(* com.in18minutes.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {}
	
	@Pointcut("execution(* com.in18minutes.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {}
	
	@Pointcut("execution(* com.in18minutes.spring.aop.springaop.*.*(..))")
	public void mainLayerExecution() {}
	
	@Pointcut("execution(* com.in18minutes.spring.aop.springaop.data.*.*(..)) &&"
			+ "execution(* com.in18minutes.spring.aop.springaop.business.*.*(..))")
	public void businessAndDataLayerExecution() {}
	
	//Regular expression inside parenthesis matching any beans containing "dao" 
	@Pointcut("bean(*dao)*")
	public void beanContainingDaoExecution() {}
	
	//All calls within layer
	@Pointcut("within(com.in18minutes.spring.aop.springaop.data..*)")
	public void allWithinDataLayerExecutionWithWithin() {}

	//Custom annotation
	@Pointcut("@annotation(com.in18minutes.spring.aop.springaop.aspect.TrackTime)")
	public void trackTimeAnnotation() {}
}
