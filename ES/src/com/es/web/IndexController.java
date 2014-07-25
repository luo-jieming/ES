package com.es.web;
/**
 * 
 */


import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 
 */
@Controller
public class IndexController extends BaseController {
	private Logger logger = Logger.getLogger(this.getClass());
	
	/**
	 * 根据项目名称访问http://127.0.0.1/springMvc3/
	 */
	@RequestMapping(value="/springMvc3", method=RequestMethod.GET)
	public String springMvc3(){
		logger.info("站点根目录访问跳转到我的主页.");
		return getIndex();
	}
	
	/**
	 * 访问http://127.0.0.1/
	 */
	@RequestMapping(value="", method=RequestMethod.GET)
	public String index(HttpServletRequest request){
		logger.info("初始页面");
		return getIndex();
	}
	
	private String getIndex(){
		return "manage/login_system";
	}

}
