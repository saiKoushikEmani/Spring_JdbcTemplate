package com.reactiveworks.transaction.annotations.exp1;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeCustomMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setId(resultSet.getInt(1));
		employee.setName(resultSet.getString(2));
		employee.setSalary(resultSet.getInt(3));
		return employee;
	}

}
