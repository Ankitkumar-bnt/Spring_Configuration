package com.config.annotationConfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AnnotationConfiguration {

	@Bean
	DataSource dataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/configDB");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean
	JdbcTemplate jdbcTemplate(DataSource ds)
	{
		return new JdbcTemplate(ds);
	}
	
	
	@Bean
	AnnotationService annotationService(JdbcTemplate jdbcTemplate)
	{
		AnnotationService service = new AnnotationService();
		service.setJdbcTemplate(jdbcTemplate);
		return service;
	}
}
