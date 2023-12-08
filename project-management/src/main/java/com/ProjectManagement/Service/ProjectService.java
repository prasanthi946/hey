package com.ProjectManagement.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ProjectManagement.Entity.ProjectManagement;

@Service
public interface ProjectService {

	List<ProjectManagement> getAllprojects();

	

}
