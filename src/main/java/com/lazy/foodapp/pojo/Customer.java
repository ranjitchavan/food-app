package com.lazy.foodapp.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(
		name="CUSTOMER",
		uniqueConstraints = {@UniqueConstraint(columnNames= {"EMAIL_ID","MOBILE_NO"})}
)

public class Customer {
	@Id
	@GeneratedValue
	@Column(name="CUSTOMER_ID")
	private Integer customerId;
	@Column(name="NAME")
	private String name;
	@Column(name="MOBILE_NO",unique=true)
	private String mobileNo;
	@Column(name="EMAIL_ID",unique=true)
	
	private String email;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="CONFIRM_PASSWORD")
	private String cpassword;
	@Column(name="PASSWORD_CHANGE_DATE")
	private Date passwordChangeDate;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public Date getPasswordChangeDate() {
		return passwordChangeDate;
	}
	@JsonIgnore
	public void setPasswordChangeDate(Date passwordChangeDate) {
		this.passwordChangeDate = passwordChangeDate;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", mobileNo=" + mobileNo + ", email=" + email
				+ ", password=" + password + ", cpassword=" + cpassword + ", passwordChangeDate=" + passwordChangeDate
				+ "]";
	}
	
	
	
}
