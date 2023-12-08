package com.ProjectManagement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="client_master")
public class ClientMaster {
	
	@Id
	@Column(name = "client_name")
	private String cilentName;
	
	@Id
	@Column(name="client_country")
	private String clientCountry;	
	
	@ManyToOne
	@JoinColumn(name="client_id", referencedColumnName = "client_id",nullable= false)
	private ProjectMaster projectmaster;
	
	@ManyToOne
	@JoinColumn(name="vertical_id", referencedColumnName = "vertical_id", nullable= false)
	private VerticalMaster verticalmaster;
	
	@Column(name="remarks")
	private String remarks;

	public String getCilentName() {
		return cilentName;
	}

	public void setCilentName(String cilentName) {
		this.cilentName = cilentName;
	}

	public String getClientCountry() {
		return clientCountry;
	}

	public void setClientCountry(String clientCountry) {
		this.clientCountry = clientCountry;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	
}
