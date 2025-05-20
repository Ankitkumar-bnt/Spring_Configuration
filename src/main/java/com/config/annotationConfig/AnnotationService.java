package com.config.annotationConfig;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class AnnotationService {
	
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	public void show()
	{
		System.out.println("From service");
	}
	
	public void getDataByAnnoConfig()
	{
		List<Employee> emp = new ArrayList<>();
		
		String query = "select * from demo";
		emp = jdbcTemplate.query(query, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setSalary(rs.getInt("salary"));
				return e;
			}
			
		});
		
		System.out.println(emp);
	}
}
