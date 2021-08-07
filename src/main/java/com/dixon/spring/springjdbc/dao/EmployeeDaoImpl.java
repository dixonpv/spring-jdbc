/**
 * 
 */
package com.dixon.spring.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.dixon.spring.springjdbc.dto.Employee;

/**
 * @author dixon
 *
 */
public class EmployeeDaoImpl implements EmployeeDao{

	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Employee employee) {
		
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, new Integer(1),employee.getFirstName(), employee.getLastName());
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
