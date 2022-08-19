package com.chainsys.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.sample.dao.UserDao;
import com.chainsys.sample.model.Users;
import com.chainsys.sample.validator.userValidator;

@Controller
public class UserCtler {

	@Autowired
	UserDao usdao;
	
	@Autowired
	userValidator vd;
	
	@GetMapping("/home")
	public String home() {
		return "home.jsp";
	}
	
	@GetMapping("/login")
	public String saveUser(@RequestParam("name") String uname, @RequestParam("pwd") String password) {
		System.out.println("Inside Controller");
		Users us = new Users();
		us.setUserName(uname);
		us.setPassword(password);
		
		if((vd.checkname(uname)) && (vd.checkpwd(password))) {
			int f = usdao.signUp(us);
			if(f > 0) {
				return "login.jsp";
			}
			else {
				return "loginerr.jsp";
			}
		}
		else {
			return "loginerr.jsp";
		}
	}
	
	@GetMapping("/changepwd")
	public String changePwd(@RequestParam("name") String uname, @RequestParam("newpwd") String npwd, @RequestParam("confpwd") String cpwd) {
		if(npwd.equals(cpwd)) {
			int f = usdao.changePwd(uname, cpwd);
			if(f > 0) {
				return "successpwd.jsp";
			}
			else {
				return "Something went wrong";
			}
		}
		else {
			return "pwderr.jsp";
		}	
	}
	
	@GetMapping("/logout")
	public String logoutUser(@RequestParam("name") String uname) {
		int f = usdao.logout(uname);
		if(f > 0) {
			return "suclogout.jsp";
		}
		else {
			return "There is some problem!, Please check your username";
		}
	}
}
