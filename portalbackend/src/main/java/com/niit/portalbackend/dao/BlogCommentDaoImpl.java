package com.niit.portalbackend.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.portalbackend.model.Blog_Comment;

@Transactional
@Repository("blogcommentdao")
public class BlogCommentDaoImpl implements BlogCommentDaoI
{
	@Autowired
	SessionFactory sessionFactory;

	public boolean addBlogComment(Blog_Comment blogComment) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(blogComment);
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}


}
