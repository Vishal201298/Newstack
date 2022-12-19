package com.springboot.demo;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;



@Entity

@Table(name = "users")

public class User {

	@Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

	 @Column(name = "user_Id")
    private long userId;

    

    @Column(name = "username")

    private String username;
    
    
    @Column(name = "technology")

    private String technology;

    

    @Column(name = "password")

    private String password;
    
   @OneToMany(mappedBy ="user")
    private List<Questions>question=new ArrayList<>();

public long getUserId() {
	return userId;
}

public void setUserId(long userId) {
	this.userId = userId;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getTechnology() {
	return technology;
}

public void setTechnology(String technology) {
	this.technology = technology;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public List<Questions> getQuestion() {
	return question;
}

public void setQuestion(List<Questions> question) {
	this.question = question;
}

public User(long userId, String username, String technology, String password, List<Questions> question) {
	super();
	this.userId = userId;
	this.username = username;
	this.technology = technology;
	this.password = password;
	this.question = question;
}

public User() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "User [userId=" + userId + ", username=" + username + ", technology=" + technology + ", password=" + password
			+ ", question=" + question + "]";
}


}