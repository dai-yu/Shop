package com.oracle.shop.control;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.shop.model.dao.UserDAO;
import com.oracle.shop.model.javabean.Users;

@Controller
@RequestMapping("/user")
public class UserControl {
	
	@Autowired
	private UserDAO dao;
	@RequestMapping("/login")
	public String login(String username, String password, HttpSession session) {
		System.out.println("user -login");
		//获取用户名和密码
		System.out.println(username+"/t" +password);
		
		Users u = dao.login(username,password);
		//判断
		if(u==null){
			System.out.println("login fail");
			return "login";
		}else{
			session.setAttribute("logineduser", u);
			return "index";
		}
		
	}

	@RequestMapping("/register")
	public String register(String username, String password, String passwordagain , String Nicheng) {
		System.out.println("user -register");
		//获取注册信息
		System.out.println(username+"/t"+password+"/t"+ Nicheng);
		
		Users u = dao.register(username, password, Nicheng);
		//判断密码是否一致
		if(password==passwordagain){
			return "index";
		}else{
			System.out.println("密码不一致！");
		return "register";
		}
	}
	
	@RequestMapping("/drop")
	public String drop(HttpSession session){
		session.putValue("logineduser", null);
		return "index";
	}

}
