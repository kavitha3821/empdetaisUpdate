package com.employ.Empdetail.domain;


import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empdetail")
public class Empdetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long empid;
	private String empname;
	private String empmobile;
	private String empemail;
	private String empaddress;
	private String emppassword;
	private LocalDateTime createddate;
	private LocalDateTime modifieddate;
	public Empdetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Empdetail(long empid, String empname, String empmobile, String empemail, String empaddress,
			String emppassword, LocalDateTime createddate, LocalDateTime modifieddate) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empmobile = empmobile;
		this.empemail = empemail;
		this.empaddress = empaddress;
		this.emppassword = emppassword;
		this.createddate = createddate;
		this.modifieddate = modifieddate;
	}
	public long getEmpid() {
		return empid;
	}
	public void setEmpid(long empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpmobile() {
		return empmobile;
	}
	public void setEmpmobile(String empmobile) {
		this.empmobile = empmobile;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	public String getEmppassword() {
		return emppassword;
	}
	public void setEmppassword(String emppassword) {
		this.emppassword = emppassword;
	}
	public LocalDateTime getCreateddate() {
		return createddate;
	}
	public void setCreateddate(LocalDateTime createddate) {
		this.createddate = createddate;
	}
	public LocalDateTime getModifieddate() {
		return modifieddate;
	}
	public void setModifieddate(LocalDateTime modifieddate) {
		this.modifieddate = modifieddate;
	}
	
	
	
}
