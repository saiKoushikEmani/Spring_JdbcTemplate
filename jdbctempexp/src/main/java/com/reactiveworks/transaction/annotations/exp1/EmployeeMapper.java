package com.reactiveworks.transaction.annotations.exp1;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {
	private Employee employee;
	@Override
	public Employee mapRow(ResultSet resultset, int row) throws SQLException {
		employee=new Employee();
		employee.setId(resultset.getInt(1));
		employee.setName(resultset.getString(2));
		employee.setSalary(resultset.getInt(3));
		return employee;
	}
}
