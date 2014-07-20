/**
 * 
 */
package com.es.service;

import com.es.po.User;


/**
 *
 */
public interface LoginService {

	public boolean userLogin(String userName,String password);
	public void addUser(User user);
	public void userRegiste(User user);
}
