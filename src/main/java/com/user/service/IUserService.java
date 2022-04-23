package com.user.service;

import java.util.List;


import com.user.entities.User;

public interface IUserService {
	
//GET ALL USERS
public List<User>getUser();

//POST
public User addUser(User user);	


}
