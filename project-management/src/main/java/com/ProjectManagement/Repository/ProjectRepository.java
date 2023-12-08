package com.ProjectManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProjectManagement.Entity.ProjectManagement;
@Repository
public interface ProjectRepository extends JpaRepository<ProjectManagement, Integer>{

}
