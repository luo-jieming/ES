/**
 * 
 */
package com.es.service;


/**
 *
 */
public interface LoginService {

	public User getUser(String userName,String password);
	public void addUser(User user);
	
}
