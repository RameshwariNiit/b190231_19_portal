package com.niit.portalbackend.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Blog_Comment 
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int blogCommentId;
	private String blogCommentText;
	
	private String commentedBy;
	private Date commentedDate;
	
	@ManyToOne
	private Blog_Portal blog;

	public int getBlogCommentId() {
		return blogCommentId;
	}

	public void setBlogCommentId(int blogCommentId) {
		this.blogCommentId = blogCommentId;
	}

	public String getBlogCommentText() {
		return blogCommentText;
	}

	public void setBlogCommentText(String blogCommentText) {
		this.blogCommentText = blogCommentText;
	}

	public String getCommentedBy() {
		return commentedBy;
	}

	public void setCommentedBy(String commentedBy) {
		this.commentedBy = commentedBy;
	}

	public Date getCommentedDate() {
		return commentedDate;
	}

	public void setCommentedDate(Date commentedDate) {
		this.commentedDate = commentedDate;
	}

	public Blog_Portal getBlog() {
		return blog;
	}

	public void setBlog(Blog_Portal blog) {
		this.blog = blog;
	}
	
	
	
}
