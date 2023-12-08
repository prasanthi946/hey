package com.ProjectManagement.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="subpractice_master")

public class SubpracticeMaster {

	@Id
	@Column(name = "subpractice_name")
	private String subpracticeName;

	@Column(name="subpractice_id")
	private int subpracticeId;
	
	@OneToMany(mappedBy= "subpracticemaster")
	private List<Employee> employee;

	
	@Column(name="practice_id", nullable = false)
	private int practiceId;
	
	@OneToMany(mappedBy= "subpracticemaster")
	private List<PracticeMaster> practicemaster;
	
	@Column(name="hrbp_id")
	private String hrbpId;
	
	@Column(name="remarks")
	private String remarks;
	
	@Column(name="ld_id")
	private String ldId;

	public String getSubpracticeName() {
		return subpracticeName;
	}

	public void setSubpracticeName(String subpracticeName) {
		this.subpracticeName = subpracticeName;
	}

	public int getSubpracticeId() {
		return subpracticeId;
	}

	public void setSubpracticeId(int subpracticeId) {
		this.subpracticeId = subpracticeId;
	}

	public int getPracticeId() {
		return practiceId;
	}

	public void setPracticeId(int practiceId) {
		this.practiceId = practiceId;
	}

	public String getHrbpId() {
		return hrbpId;
	}

	public void setHrbpId(String hrbpId) {
		this.hrbpId = hrbpId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getLdId() {
		return ldId;
	}

	public void setLdId(String ldId) {
		this.ldId = ldId;
	}
	
}