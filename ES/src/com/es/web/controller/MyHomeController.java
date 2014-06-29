/**
 * 
 */
package com.es.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author
 */
@Controller
public class MyHomeController extends BaseController {

	@RequestMapping(value="/user/home",method=RequestMethod.GET)
	public String ajaxGet(){
		
		return "MyHome";
	}
}
