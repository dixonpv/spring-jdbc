/**
 * 
 */
package com.dixon.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author dixon
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/dixon/spring/springjdbc/config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, new Integer(1),"dixon", "pv");
		System.out.println("Number of records inserted are:"+result);
	}

}
