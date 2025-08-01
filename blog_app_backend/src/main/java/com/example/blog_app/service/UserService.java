package com.example.blog_app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.blog_app.payloads.UserDto;


public interface UserService {
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user, Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUSers();
	void deleteUser(Integer userId);
	
}
