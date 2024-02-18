package com.one_smile.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Enquiry_table {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer enqid;
	
	String firstname;
	String lastname;
	int mobile_no;
	String Reason_for_contact;

public Enquiry_table() {
	// TODO Auto-generated constructor stub
}

public Enquiry_table(Integer enqid, String firstname, String lastname, int mobile_no, String reason_for_contact) {
	super();
	this.enqid = enqid;
	this.firstname = firstname;
	this.lastname = lastname;
	this.mobile_no = mobile_no;
	Reason_for_contact = reason_for_contact;
}

public Integer getEnqid() {
	return enqid;
}

public void setEnqid(Integer enqid) {
	this.enqid = enqid;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public int getMobile_no() {
	return mobile_no;
}

public void setMobile_no(int mobile_no) {
	this.mobile_no = mobile_no;
}

public String getReason_for_contact() {
	return Reason_for_contact;
}

public void setReason_for_contact(String reason_for_contact) {
	Reason_for_contact = reason_for_contact;
}

@Override
public String toString() {
	return "Enquiry_table [enqid=" + enqid + ", firstname=" + firstname + ", lastname=" + lastname + ", mobile_no="
			+ mobile_no + ", Reason_for_contact=" + Reason_for_contact + "]";
}


  
}

