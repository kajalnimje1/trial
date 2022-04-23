package com.user.entities;

import javax.persistence.Entity;

import javax.persistence.Id;


@Entity
public class User {
	
	
//DECLARE VARIABLE
@Id
private long UserID;
private String UserName;
private String UserCity;
private String MyUsername;
private String Password;

//PARAMETERIZED CONSTRUCTOR
public User(long userID, String userName, String userCity,String MyUsername, String password) {
	super();
	UserID = userID;
	UserName = userName;
	UserCity = userCity;
	MyUsername = MyUsername;
	Password = password;
}

//DEFAULT CONSTRUCTOR
public User() {
	super();
	// TODO Auto-generated constructor stub
}


//GETTER AND SETTER METHOD
public long getUserID() {
	return UserID;
}

public String getMyUsername() {
	return MyUsername;
}

public void setMyUsername(String myusername) {
	MyUsername = myusername;
}

public String getPassword() {
	return Password;
}

public void setPassword(String password) {
	Password = password;
}

public void setUserID(long userID) {
	UserID = userID;
}

public String getUserName() {
	return UserName;
}

public void setUserName(String userName) {
	UserName = userName;
}

public String getUserCity() {
	return UserCity;
}

public void setUserCity(String userCity) {
	UserCity = userCity;
}

//toString METHOD
@Override
public String toString() {
	return "User [UserID=" + UserID + ", UserName=" + UserName + ", UserCity=" + UserCity + ", MyUsername=" + MyUsername
			+ ", Password=" + Password + "]";
}








}
