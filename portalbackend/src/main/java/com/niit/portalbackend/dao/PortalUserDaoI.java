package com.niit.portalbackend.dao;

import org.springframework.stereotype.Component;

import com.niit.portalbackend.model.Portal_User;

@Component
public interface PortalUserDaoI 
{
	
	boolean addPortalUser(Portal_User puser);

}
