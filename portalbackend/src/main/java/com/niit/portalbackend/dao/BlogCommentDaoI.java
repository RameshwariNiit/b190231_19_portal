package com.niit.portalbackend.dao;

import org.springframework.stereotype.Component;


import com.niit.portalbackend.model.Blog_Comment;

@Component
public interface BlogCommentDaoI 
{
	
	public boolean addBlogComment(Blog_Comment blogComment);

}
