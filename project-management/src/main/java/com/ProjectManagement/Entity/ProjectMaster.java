package com.ProjectManagement.Entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="project_master")
public class ProjectMaster {
	
	@Id
	@Column(name = "project_name")
	private String projectName;

	@Column(name = "project_manager")
	private String projectManager;
	
	@Column(name = "pricing_model")
	private String pricingModel;
	
	@Column(name = "it_service")
	private String itService;
	
	@Column(name = "service_model")
	private String serviceModel;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;
	
	@Column(name = "client_id", nullable= false)
	private int cilentId;
	
	@OneToMany(mappedBy= "projectmaster")
	private List<ClientMaster> clientmaster;
	
	@ManyToOne
	@JoinColumn(name="vertical_id", referencedColumnName = "vertical_id", nullable= false)
	private VerticalMaster verticalmaster;
	
	@Column(name = "execution_model")
	private String executionModel;
	
	@ManyToOne
	@JoinColumn(name="project_id", referencedColumnName = "projectId", nullable= false)
	private ProjectManagement projectmanagement;
	
	@Column(name="remarks")
	private String remarks;
	
	@Column(name="service_line")
	private String serviceLine;
	
	@Column(name="project_location")
	private String projectLocation;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getPricingModel() {
		return pricingModel;
	}

	public void setPricingModel(String pricingModel) {
		this.pricingModel = pricingModel;
	}

	public String getItService() {
		return itService;
	}

	public void setItService(String itService) {
		this.itService = itService;
	}

	public String getServiceModel() {
		return serviceModel;
	}

	public void setServiceModel(String serviceModel) {
		this.serviceModel = serviceModel;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getCilentId() {
		return cilentId;
	}

	public void setCilentId(int cilentId) {
		this.cilentId = cilentId;
	}

	
	public String getExecutionModel() {
		return executionModel;
	}

	public void setExecutionModel(String executionModel) {
		this.executionModel = executionModel;
	}

	


	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	public ProjectManagement getProjectmanagement() {
		return projectmanagement;
	}

	public void setProjectmanagement(ProjectManagement projectmanagement) {
		this.projectmanagement = projectmanagement;
	}

	public String getServiceLine() {
		return serviceLine;
	}

	public void setServiceLine(String serviceLine) {
		this.serviceLine = serviceLine;
	}

	public String getProjectLocation() {
		return projectLocation;
	}

	public void setProjectLocation(String projectLocation) {
		this.projectLocation = projectLocation;
	}
	
	
}
