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
	public String register(String username, String password, String passwordagain , String Nicheng, String question, String answer) {
		System.out.println("user -register");
		//获取注册信息
		System.out.println(username+"/t"+password+"/t"+ Nicheng);
		//调用dao的方法，把表单数据存入数据库中
		int user = dao.register(username, password, Nicheng, question, answer);
		
		if (user>0){
			return "login";
		}else{
			return "register";
		}
		
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping("/drop")
	public String drop(HttpSession session){
		session.putValue("logineduser", null);
		return "index";
	}
	
	@RequestMapping("/forget")
	public String forget(String username, String question, String answer){
		System.out.println("user -forget");
		//获取填写信息
		//导入dao并进行判断
		Users result= dao.forget(username, question, answer);
		//判断是否有该用户
		if (result==null){
			System.out.println("信息错误!");
			return "forget";
		}else{
			return "Updatepassword";
		}
		
	}
	@RequestMapping("/Updatepassword")
	public String update(String password,String username){
		//调用dao方法，先判断是否有该用户，若有则将表单中填写的新密码写入数据库中
		int update= dao.update(username, password);
		if (update>0){
			return "login";
		}else{
			return "Updatepassword";
		}
		
		
	}

}
