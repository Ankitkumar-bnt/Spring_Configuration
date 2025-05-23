package com.config.beanLifeCycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class SpringBeanLifeCycle {

	public SpringBeanLifeCycle() {
		System.out.println("1.Constructor: Bean instantiated");
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("2. @PostConstruct: Bean initialized");
	}
	
	public void ready()
	{
		System.out.println("3. Bean is ready. Doing work...");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("4. @PreDestroy: Bean about to be destroyed");
	}
}
