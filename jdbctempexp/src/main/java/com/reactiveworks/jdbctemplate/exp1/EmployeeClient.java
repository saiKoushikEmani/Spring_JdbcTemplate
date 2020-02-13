package com.reactiveworks.jdbctemplate.exp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {
	// contains the spring config xml path
	String filepath = getClass().getClassLoader().getResource("employeeexp1config.xml").toString();

	public void client() {
		ApplicationContext application = new ClassPathXmlApplicationContext(filepath);
		Employee employee = (Employee)application.getBean("employee");
		EmployeeDaoImpl bean = (EmployeeDaoImpl) application.getBean("employeeDaoImpl");
		((AbstractApplicationContext) application).close();
	}
}
