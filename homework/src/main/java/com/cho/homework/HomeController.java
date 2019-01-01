package com.cho.homework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		logger.info("/");
		
		return "home";
	}
	
	@RequestMapping(value = "/intro/introView", method = RequestMethod.GET)
	public String Intro() {
		logger.info("/intro/introView");
		
		return "intro/introView";
	}
	
}
