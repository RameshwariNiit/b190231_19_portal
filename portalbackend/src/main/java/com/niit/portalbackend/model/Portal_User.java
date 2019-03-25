package com.niit.portalbackend.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Portal_User
{

	@Id
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String email;
	private String Mobile;
	private String user_role;
	private boolean status;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "puser", fetch =FetchType.EAGER)
	private List<Blog_Portal> blogs;
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getUser_role() {
		return user_role;
	}
	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public List<Blog_Portal> getBlogs() {
		return blogs;
	}
	public void setBlogs(List<Blog_Portal> blogs) {
		this.blogs = blogs;
	}
	
	
	
	
}
