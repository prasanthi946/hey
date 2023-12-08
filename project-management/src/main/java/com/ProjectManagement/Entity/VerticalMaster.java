package com.ProjectManagement.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="vertical_master")
public class VerticalMaster {
	@Id
	@Column(name = "vertical")
	private String vertical;
	
	@Column(name="vertical_id")
	private int verticalId;
	
	@OneToMany(mappedBy= "verticalmaster")
	private List<ProjectMaster> projectmaster;
	
	@OneToMany(mappedBy= "verticalmaster")
	private List<ClientMaster> clientmaster;
	
	@Column(name="remarks")
	private String remarks;	

	public String getVertical() {
		return vertical;
	}

	public void setVertical(String vertical) {
		this.vertical = vertical;
	}

	public int getVerticalId() {
		return verticalId;
	}

	public void setVerticalId(int verticalId) {
		this.verticalId = verticalId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
