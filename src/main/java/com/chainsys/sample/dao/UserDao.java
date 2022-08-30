package com.chainsys.sample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.chainsys.sample.dto.UserDto;
import com.chainsys.sample.mapper.UserMapper;
import com.chainsys.sample.model.Users;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate temp;
	
	public int signUp(UserDto us) {
		System.out.println("Successfully saved!");
		String q = "insert into usertable(userid, username, password) values (userId.nextval, ?, ?)";
		System.out.println(us.getName());
		Object[] data = {us.getName(), us.getPwd()};//create the object for execute the query
		 
		int rows = temp.update(q, data);//execute the query
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
	
	public String findOne(Integer userId) {
		String sql = "select username from usertable where userid = ?";
		System.out.println(userId);
		String queryForObject = null;
		try {
			queryForObject = temp.queryForObject(sql, String.class, userId);
			System.out.println(queryForObject);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return queryForObject;
	}
	
	public Users FindById(Integer userId) {
		String sql = "select * from usertable where userid = ?";
		System.out.println(userId);
		Users queryObj = null;
		try {
			queryObj = temp.queryForObject(sql, new UserMapper(), userId);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return queryObj;
		
	}
	
	public List<Users> findAll(){
		
		String sql = "select * from usertable";
		List<Users> data = temp.query(sql, new UserMapper());
		return data;
		
	}
	
}
