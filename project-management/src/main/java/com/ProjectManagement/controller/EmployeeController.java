package com.ProjectManagement.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjectManagement.Entity.Employee;
import com.ProjectManagement.Entity.ProjectManagement;
import com.ProjectManagement.Service.EmployeeService;
import com.ProjectManagement.Service.ProjectService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
    private EmployeeService employeeService;
	
	@Autowired
    private ProjectService projectService;

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    
    @GetMapping("/{empCode}")
    public ResponseEntity<Employee> getEmployeeByEmpCode(@PathVariable int empCode) {
        Employee employee = employeeService.getEmployeeByEmpCode(empCode);
        if (employee != null) {
            return new ResponseEntity<>(employee, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    

    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        Employee savedEmployee = employeeService.saveEmployee(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

      @PutMapping("/{empCode}")
    public ResponseEntity<Employee> updatedEmployee(@PathVariable int empCode, @RequestBody Employee updatedEmployee) {
        Employee employee = employeeService.getEmployeeByEmpCode(empCode);
        if (employee != null) {
            updatedEmployee.setEmpCode(empCode);
            Employee savedEmployee = employeeService.updateEmployee(updatedEmployee);
            return new ResponseEntity<>(savedEmployee, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

   @DeleteMapping("/{empCode}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable int empCode) {
        Employee employee = employeeService.getEmployeeByEmpCode(empCode);
        if (employee != null) {
            employeeService.deleteEmployee(empCode);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
   
   @GetMapping("/proj")
   public ResponseEntity<List<ProjectManagement>> getAllprojects() {
       List<ProjectManagement> projects = projectService.getAllprojects(
    		   
    		   );
       return new ResponseEntity<>(projects, HttpStatus.OK);
  
}
}