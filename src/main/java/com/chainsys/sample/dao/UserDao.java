package com.chainsys.sample.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.chainsys.sample.model.Users;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate temp;
	
	public int signUp(Users us) {
		String q = "insert into usertable(userid, username, password) values (userId.nextval, ?, ?)";
		Object[] data = {us.getUserName(), us.getPassword()};
		int rows = temp.update(q, data);
		return rows;
	}
	
	public int changePwd(String uname, String pwd) {
		String q = "update usertable set password = ? where username = ?";
		Object [] data = {pwd, uname};
		int flag = temp.update(q, data);
		return flag;
	}
	
	public int logout(String uname) {
		String q = "delete from usertable where username = ?";
		Object [] data = {uname};
		int flag = temp.update(q, data);
		return flag;
	}
}
