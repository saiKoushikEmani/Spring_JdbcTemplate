package com.reactiveworks.transaction.exp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {
	// contains the spring config xml path
	String filepath = getClass().getClassLoader().getResource("programativespringconfig.xml").toString();

	public void client() throws UnableToPerformTheOperation {
		ApplicationContext application = new ClassPathXmlApplicationContext(filepath);
		Employee employee=application.getBean("employee",Employee.class);
		EmployeeDaoImpl bean = (EmployeeDaoImpl)application.getBean("employeeDaoImpl");
		bean.addEmployee(employee);
	}
}
