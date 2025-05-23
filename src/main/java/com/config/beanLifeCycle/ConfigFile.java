package com.config.beanLifeCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigFile {

	@Bean
	SpringBeanLifeCycle springBeanLifeCycle()
	{
		return new SpringBeanLifeCycle();
	}
}
