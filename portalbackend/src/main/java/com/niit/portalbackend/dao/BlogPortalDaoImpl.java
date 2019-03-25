package com.niit.portalbackend.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.portalbackend.model.Blog_Portal;

@Transactional
@Repository("blogportaldao")
public class BlogPortalDaoImpl implements BlogPortalDaoI
{


	@Autowired
	SessionFactory sessionFactory;

	public boolean addBlog(Blog_Portal blog) {
		try {
			sessionFactory.getCurrentSession().save(blog);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
}
