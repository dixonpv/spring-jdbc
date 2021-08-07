/**
 * 
 */
package com.dixon.spring.springjdbc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dixon.spring.springjdbc.dao.EmployeeDao;
import com.dixon.spring.springjdbc.dao.EmployeeDaoImpl;
import com.dixon.spring.springjdbc.dto.Employee;

/**
 * @author dixon
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		ApplicationContext context = new ClassPathXmlApplicationContext("com/dixon/spring/springjdbc/test/config.xml");
		EmployeeDao employeeDao = (EmployeeDaoImpl) context.getBean("employeeDao");
		Employee employee = new Employee();	
		employee.setId(12);
		employee.setFirstName("Dix");
		employee.setLastName("pv");
		int result = employeeDao.create(employee);
		System.out.println("Number of records inserted are:"+result);
	}

}
