package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.user.entities.User;
import com.user.service.IUserService;


@RestController
public class UserController {

//CREATE OBJECT OF IUserService
	@Autowired
	private IUserService iuserService;
	
	
//GET ALL USERS
@GetMapping("/user")
public List<User> getUser(){
	return this.iuserService.getUser();	
}

//POST
@PostMapping("/user")
public User addUser(@RequestBody User user) {
	return this.iuserService.addUser(user);	
}

/**public ResponseEntity<User> addUser( @RequestBody User user) {
    User newUser = iuserService.addUser(user);
    return new ResponseEntity<>(newUser, HttpStatus.CREATED);
}***/

//FOR LOGIN
@GetMapping("/home")
public String home() {
	return "this is the home page";
	
}
@GetMapping("/admin")
public String admin() {
	return "this is the admin page";
	
}
	
}
