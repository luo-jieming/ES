package com.es.dao.mappers;

import com.es.po.User;

public interface UserMapper {
	public void insertUser(User user);
	public User findUserById(int id);
	public User findUserByUsernameAndPwd(User user);
}
