package com.config.xmlConfig;

import org.springframework.jdbc.core.JdbcTemplate;

public class XMLConstructorBean {

	XMLServices serve;
	JdbcTemplate jdbcTemplate;
	
	public XMLConstructorBean(XMLServices serve,JdbcTemplate jdbcTemplate)
	{
		this.serve = serve;
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void methodOfXMLConstructor()
	{
		serve.show();
		System.out.println("Hello from XMLConstructor");
	}
	
	public void addData(String name, int salary)
	{
		String query = "insert into demo(name, salary) values(?,?);";
		int update = jdbcTemplate.update(query,name,salary);
		if(update==1)
			System.out.println("Data added");
		else
			System.out.println("Data not added");
	}
}
