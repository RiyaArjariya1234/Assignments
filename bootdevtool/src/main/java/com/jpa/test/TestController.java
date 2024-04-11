package com.jpa.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test()
	{
		int a=9;
		int b=1;
		int c=3;
		return "this is just testing /t sum of a and b is "+(a+b+c);
	}

}
