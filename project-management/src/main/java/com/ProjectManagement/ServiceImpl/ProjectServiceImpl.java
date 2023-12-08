package com.ProjectManagement.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectManagement.Entity.Employee;
import com.ProjectManagement.Entity.ProjectManagement;
import com.ProjectManagement.Repository.ProjectRepository;
import com.ProjectManagement.Service.ProjectService;
 @Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public List<ProjectManagement> getAllprojects() {
		
		return projectRepository.findAll();
	}
	
	
}
 
