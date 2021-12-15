package com.infra.company;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Component
@Entity
public class Company {
	
	@Id
	private String companyName = "";
	private String location = "";
	private Integer noOfEmployee;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getNoOfEmployee() {
		return noOfEmployee;
	}
	public void setNoOfEmployee(Integer noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}
	public Company(String companyName, String location, Integer noOfEmployee) {
		super();
		this.companyName = companyName;
		this.location = location;
		this.noOfEmployee = noOfEmployee;
	}
	public Company() {

	}
	
}
