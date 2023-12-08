package com.ProjectManagement.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectManagement.Entity.Employee;
import com.ProjectManagement.Repository.EmployeeRepository;
import com.ProjectManagement.Service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeByEmpCode(int empCode) {
		 Optional<Employee> result = employeeRepository.findById(empCode);
	        return result.orElse(null);
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee updatedEmployee) {
		return employeeRepository.save(updatedEmployee);	}

	@Override
	public void deleteEmployee(int empCode) {
		   employeeRepository.deleteById(empCode);
	
	}	
}
