package com.oracle.shop.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserControl {

	@RequestMapping("/login")
	public String login(String username,String password) {
		System.out.println("user -login:"+username+"   "+password);
		return "index";
	}

	@RequestMapping("/register")
	public String register() {
		System.out.println("user -register");
		return "index";
	}
}
