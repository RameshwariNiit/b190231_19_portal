package com.niit.portalbackend.testcase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.portalbackend.config.DBConfig;
import com.niit.portalbackend.dao.PortalUserDaoI;
import com.niit.portalbackend.model.Portal_User;

public class Portal_User_TestCase {

	
	AnnotationConfigApplicationContext context;
	Portal_User portaluser;
	PortalUserDaoI puserdao;
	
	@Before
	public void init()
	{
		
		context = new AnnotationConfigApplicationContext(DBConfig.class);
		context.scan("com.niit.portalbackend");
		portaluser = new Portal_User();
		puserdao = (PortalUserDaoI) context.getBean("portaluserdao");
		
		
	}
	
	@Test
	public void test() {
		//fail("Not yet implemented");
	}

}
