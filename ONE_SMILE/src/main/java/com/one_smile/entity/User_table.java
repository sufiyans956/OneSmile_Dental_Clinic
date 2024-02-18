package com.one_smile.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class User_table {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer uid;
	String Uname;
	String password;
	String firstname;
	String Lastname;
	String email;
	long mobileno;
	
	@Enumerated(EnumType.STRING)
	private User_role role;

	public User_table() {
		// TODO Auto-generated constructor stub
	}

	public User_table(Integer uid, String uname, String password, String firstname, String lastname, String email,
			long mobileno, User_role role) {
		super();
		this.uid = uid;
		Uname = uname;
		this.password = password;
		this.firstname = firstname;
		Lastname = lastname;
		this.email = email;
		this.mobileno = mobileno;
		this.role = role;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return Uname;
	}

	public void setUname(String uname) {
		Uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}

	public User_role getRole() {
		return role;
	}

	public void setRole(User_role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User_table [uid=" + uid + ", Uname=" + Uname + ", password=" + password + ", firstname=" + firstname
				+ ", Lastname=" + Lastname + ", email=" + email + ", mobileno=" + mobileno + ", role=" + role + "]";
	}
	
	
	
	
}
