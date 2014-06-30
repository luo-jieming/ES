/**
 * 
 */
package com.es.service;

import com.es.po.User;


/**
 *
 */
public interface LoginService {

	public User getUser(String userName,String password);
	public void addUser(User user);
	
}
