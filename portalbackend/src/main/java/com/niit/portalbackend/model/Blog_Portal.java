package com.niit.portalbackend.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Blog_Portal {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int blogId;
	private String blogName;
	private String blogDescription;
	private boolean approved;
	private String remarks;
	private int likes;
	private Date blogDate;

	@ManyToOne
	private Portal_User puser;

	@JsonIgnore
	@OneToMany(mappedBy = "blog", fetch = FetchType.EAGER)
	private List<Blog_Comment> blogComments;

	public List<Blog_Comment> getBlogComments() {
		return blogComments;
	}

	public void setBlogComments(List<Blog_Comment> blogComments) {
		this.blogComments = blogComments;
	}

	public int getBlogId() {
		return blogId;
	}

	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}

	public String getBlogName() {
		return blogName;
	}

	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}

	public String getBlogDescription() {
		return blogDescription;
	}

	public void setBlogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public Date getBlogDate() {
		return blogDate;
	}

	public void setBlogDate(Date blogDate) {
		this.blogDate = blogDate;
	}

	public Portal_User getPuser() {
		return puser;
	}

	public void setPuser(Portal_User puser) {
		this.puser = puser;
	}

}
