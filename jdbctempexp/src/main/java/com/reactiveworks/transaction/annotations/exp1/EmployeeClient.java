package com.reactiveworks.transaction.annotations.exp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {
	// contains the spring config xml path
	String filepath = getClass().getClassLoader().getResource("declarativeconfig.xml").toString();

	public void client() throws UnableToPerformTheOperation {
		ApplicationContext application = new ClassPathXmlApplicationContext(filepath);
		Employee employee=application.getBean("employee",Employee.class);
		EmployeeDaoImpl bean = (EmployeeDaoImpl)application.getBean("employeeDaoImpl");
		try {
			bean.getEmployee();
		} catch (UnableToFetchEmployeeDetails e) {
			e.printStackTrace();
		}
	}
}
