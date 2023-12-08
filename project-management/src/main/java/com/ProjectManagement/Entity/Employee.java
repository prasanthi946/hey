package com.ProjectManagement.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_master")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empCode;
	
	@ManyToOne
	@JoinColumn(name="emp_id", referencedColumnName = "emp_id", insertable=false, updatable=false)
	private ProjectManagement projectmanagement;
	
	@Column(name="doj")
	private Date doj;
	
	@Column(name="reporting_manager")
	private String reportingManager;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="emp_status")
	private String empStatus;
	
	@Column(name="employee_name")
	private String employeeName;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="first_lastname")
	private String firstLastname;
	
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="personal_email_id")
	private String personalEmailId;
	
	@Column(name="official_email_id")
	private String officialEmailId;
	
	@Column(name="base_location")
	private String baseLocation;
	
	@Column(name="ft_cons")
	private String ftCons;
	
	@Column(name="hrb_premarks")
	private String hrbPremarks;
	
	@Column(name="linkedin")
	private String linkedin;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="past_exp_years")
	private int pastExpYears;
	
	@Column(name="past_exp_months")
	private int pastExpMonths;
	
	@ManyToOne
	@JoinColumn(name="subpractice_id", referencedColumnName = "subpractice_id", insertable=false, updatable=false)
	private SubpracticeMaster subpracticemaster;
	
	
	@Column(name="hrbp_id")
	private String hrbpId;
	
	@Column(name="doe")
	private Date doe;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="region")
	private String region;



	public int getEmpCode() {
		return empCode;
	}

	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	public ProjectManagement getProjectmanagement() {
		return projectmanagement;
	}

	public void setProjectmanagement(ProjectManagement projectmanagement) {
		this.projectmanagement = projectmanagement;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getReportingManager() {
		return reportingManager;
	}

	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstLastname() {
		return firstLastname;
	}

	public void setFirstLastname(String firstLastname) {
		this.firstLastname = firstLastname;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPersonalEmailId() {
		return personalEmailId;
	}

	public void setPersonalEmailId(String personalEmailId) {
		this.personalEmailId = personalEmailId;
	}

	public String getOfficialEmailId() {
		return officialEmailId;
	}

	public void setOfficialEmailId(String officialEmailId) {
		this.officialEmailId = officialEmailId;
	}

	public String getBaseLocation() {
		return baseLocation;
	}

	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}

	public String getFtCons() {
		return ftCons;
	}

	public void setFtCons(String ftCons) {
		this.ftCons = ftCons;
	}
	
	public SubpracticeMaster getSubpracticemaster() {
		return subpracticemaster;
	}

	public void setSubpracticemaster(SubpracticeMaster subpracticemaster) {
		this.subpracticemaster = subpracticemaster;
	}

	public String getHrbPremarks() {
		return hrbPremarks;
	}

	public void setHrbPremarks(String hrbPremarks) {
		this.hrbPremarks = hrbPremarks;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public int getPastExpYears() {
		return pastExpYears;
	}

	public void setPastExpYears(int pastExpYears) {
		this.pastExpYears = pastExpYears;
	}

	public int getPastExpMonths() {
		return pastExpMonths;
	}

	public void setPastExpMonths(int pastExpMonths) {
		this.pastExpMonths = pastExpMonths;
	}

	public String getHrbpId() {
		return hrbpId;
	}

	public void setHrbpId(String hrbpId) {
		this.hrbpId = hrbpId;
	}

	public Date getDoe() {
		return doe;
	}

	public void setDoe(Date doe) {
		this.doe = doe;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

}