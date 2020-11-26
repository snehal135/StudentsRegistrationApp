package com.demo.springboot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAspect {

	 @Before("execution(* com.demo.springboot.service.*.*(..))")         
	    public void logBefore(JoinPoint joinPoint)
	    {
	        System.out.println("Before Excecuting: " + joinPoint.getSignature().getName());
	    }
	
	 @After("execution(* com.demo.springboot.service.*.*(..))")         
	    public void logAfter(JoinPoint joinPoint)
	    {
	        System.out.println("After Excecuting: " + joinPoint.getSignature().getName());
	    }
	
}
