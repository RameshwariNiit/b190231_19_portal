package com.niit.portalbackend.testcase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.portalbackend.config.DBConfig;
import com.niit.portalbackend.dao.BlogPortalDaoI;
import com.niit.portalbackend.dao.PortalUserDaoI;
import com.niit.portalbackend.model.Blog_Portal;
import com.niit.portalbackend.model.Portal_User;

public class BlogTestCase {

	AnnotationConfigApplicationContext context;
	
	Portal_User puser;
	PortalUserDaoI puserdao;
	Blog_Portal blog;
	BlogPortalDaoI blogportaldao;
	
	
	@Before
	public void init()
	{
		
		context = new AnnotationConfigApplicationContext(DBConfig.class);
		context.scan("com.niit.portalbackend");
		blog = new Blog_Portal();
		blogportaldao = (BlogPortalDaoI)context.getBean("blogportaldao");
		puserdao = (PortalUserDaoI)context.getBean("portaluserdao");
	}
	
	@Test
	public void test() {
	//	fail("Not yet implemented");
	}

}
