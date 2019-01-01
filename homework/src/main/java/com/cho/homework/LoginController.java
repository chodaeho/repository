package com.cho.homework;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value = "/login/loginForm", method = RequestMethod.GET)
	public String loginFor() {
		logger.info("/login/loginForm");
		
		return "login/loginForm";
	}
	
	@RequestMapping(value = "/login/accessDenied", method = RequestMethod.GET)
	public String accessDenied() {
		logger.info("/login/accessDenied");
		
		return "login/accessDenied";
	}
}
