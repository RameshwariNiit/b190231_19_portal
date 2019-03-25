package com.niit.portalbackend.dao;

import org.springframework.stereotype.Component;

import com.niit.portalbackend.model.Blog_Portal;

@Component
public interface BlogPortalDaoI {

	public boolean addBlog(Blog_Portal blog);
}
