package com.niit.dao;

import java.util.List;

import com.niit.model.UserDetails;

public interface UserDAO {



	public boolean save(UserDetails user);
	
	public boolean delete(UserDetails user);
	public boolean update(UserDetails user);
	public List<UserDetails> listUserDetailss();
	public UserDetails getUserDetails(int userId);

}

