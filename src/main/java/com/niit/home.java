package com.niit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class home {

	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String ladingPage()
	{
		
		return "index";
				
	}
	@RequestMapping(value="login",method = RequestMethod.GET)
	public String helloPage(Model model)
	{
		model.addAttribute("message", "welcome to spring  mvc");
		return "hello";
		
		
	}
}
