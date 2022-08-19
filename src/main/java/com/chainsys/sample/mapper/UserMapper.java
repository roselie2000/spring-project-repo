package com.chainsys.sample.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.chainsys.sample.model.Users;

public class UserMapper implements RowMapper<Users>{

	@Override
	public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
		Users us = new Users();
		int userId = rs.getInt("userid");
		String userName = rs.getString("username");
		String password = rs.getString("password");
		
		us.setUserId(userId);
		us.setUserName(userName);
		us.setPassword(password);
		return us;
	}
	
}
