package com.ProjectManagement.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="practice_master")
public class PracticeMaster {
	
	@Id
	@Column(name = "practice_name")
	private String practiceName;
	
	@ManyToOne
	@JoinColumn(name="practice_id", referencedColumnName = "practice_id", nullable= false, insertable=false, updatable=false)
	private SubpracticeMaster subpracticemaster;
	
	public SubpracticeMaster getSubpracticemaster() {
		return subpracticemaster;
	}

	public void setSubpracticemaster(SubpracticeMaster subpracticemaster) {
		this.subpracticemaster = subpracticemaster;
	}

	@Column(name="pd_empid")
	private String pdEmpid;
	
	@Column(name="practice_start_date")
	private Date practiceStartDate;
	
	@Column(name="description")
	private String description;
	
	@Column(name="hrbp_id")
	private String hrbpId;

	public String getPracticeName() {
		return practiceName;
	}

	public void setPracticeName(String practiceName) {
		this.practiceName = practiceName;
	}

		public String getPdEmpid() {
		return pdEmpid;
	}

	public void setPdEmpid(String pdEmpid) {
		this.pdEmpid = pdEmpid;
	}

	public Date getPracticeStartDate() {
		return practiceStartDate;
	}

	public void setPracticeStartDate(Date practiceStartDate) {
		this.practiceStartDate = practiceStartDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHrbpId() {
		return hrbpId;
	}

	public void setHrbpId(String hrbpId) {
		this.hrbpId = hrbpId;
	}

}
