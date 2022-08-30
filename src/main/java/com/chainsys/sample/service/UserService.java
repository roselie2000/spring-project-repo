package com.chainsys.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.chainsys.sample.dao.UserDao;
import com.chainsys.sample.dto.UserDto;
import com.chainsys.sample.model.Users;

@Service
public class UserService {

	@Autowired
	UserDao usdao;
	public int signup(UserDto us) {
		Users user = new Users();
		System.out.println(us.getName());
		System.out.println(us.getPwd());
		user.setUserName(user.getUserName());
		user.setPassword(user.getPassword());
		
//		UserDao usdao = new UserDao();
		int f = usdao.signUp(us);
		System.out.println(f);
		return f;
	}
}
