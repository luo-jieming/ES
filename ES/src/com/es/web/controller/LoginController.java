/**
 * 
 */
package com.es.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.es.po.User;
import com.es.service.LoginService;
import com.es.web.BaseController;

/**
 * 登陆方法
 */
@Controller
@RequestMapping("/user")
public class LoginController extends BaseController{
	
	private Logger logger = Logger.getLogger(this.getClass());

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(){
		logger.info("用户登录页面");
		return "manage/login_system";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String logon(String userName,String passWord){
		User user = null;
		logger.info("用户登录验证");
		try {
			user = loginService.getUser(userName, passWord);
		} catch (RuntimeException e) {
			logger.error("用户登录验证失败!" + e);
		}
		if(user!=null){
			return "MyHome";
		}else{
			return "manage/login_system";
		}
	}
	
//	@RequestMapping(value="/register",method=RequestMethod.POST)
	@RequestMapping(value="/register")
	public String register(User user){
		logger.info("用户注册");
//		loginService.addUser(user);
		return "manage/register";
	}

}
