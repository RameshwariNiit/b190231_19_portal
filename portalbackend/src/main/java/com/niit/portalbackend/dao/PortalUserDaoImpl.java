package com.niit.portalbackend.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.portalbackend.model.Portal_User;


@Transactional
@Repository("portaluserdao")
public class PortalUserDaoImpl implements PortalUserDaoI 
{

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean addPortalUser(Portal_User puser) {
	
		
		try {
			sessionFactory.getCurrentSession().persist(puser);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

}
