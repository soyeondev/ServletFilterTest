package com.example.logintest2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("test")
	public void test() {}
	
	@RequestMapping("loginform")
	public void loginform() {
		
}
	
}
