package com.reactiveworks.transaction.annotations.exp1;

import java.util.List;
import java.util.Map;

public interface EmployeeDao {

	public int addEmployee(Employee e) throws UnableToPerformTheOperation;

	public int deleteEmployee(Employee employee) throws UnableToPerformTheOperation;

	public int update(Employee employee) throws UnableToPerformTheOperation;

	public List<Employee> getEmployee() throws UnableToFetchEmployeeDetails;

	public Integer getCountEmployee() throws UnableToFetchEmployeeDetails;

	public String getNameEmployee(int id) throws UnableToFetchEmployeeDetails;

	public Map<String, Object> getSingleEmployee(int id) throws UnableToFetchEmployeeDetails;

	public Employee getTotalSingleEmployee(int id) throws UnableToFetchEmployeeDetails;

}
