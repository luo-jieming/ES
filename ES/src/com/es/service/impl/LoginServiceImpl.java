/**
 * 
 */
package com.es.service.impl;

import org.springframework.stereotype.Service;

import com.es.dao.mappers.UserMapper;
import com.es.po.User;
import com.es.service.LoginService;

/**
 *
 */
@Service
public class LoginServiceImpl implements LoginService {

	private UserMapper userMapper;
	
	@Override
	public boolean userLogin(String userName,String password) {
		User user = new User();
		user.setUserName(userName);
		user.setPassWord(password);
		User userResult = userMapper.findUserByUsernameAndPwd(user);
		if(userResult!=null){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public void addUser(User user) {
		userMapper.insertUser(user);
	}
	


	@Override
	public void userRegiste(User user) {
		userMapper.insertUser(user);		
	}
	


	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
}
