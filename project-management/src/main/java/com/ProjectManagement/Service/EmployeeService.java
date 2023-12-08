package com.ProjectManagement.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ProjectManagement.Entity.Employee;
@Service
public interface EmployeeService {

	List<Employee> getAllEmployees();

	Employee getEmployeeByEmpCode(int empCode);

	Employee saveEmployee(Employee employee);

	Employee updateEmployee(Employee updatedEmployee);

	void deleteEmployee(int empCode);

}
