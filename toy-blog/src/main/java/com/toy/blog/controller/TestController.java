package com.toy.blog.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toy.blog.model.User;
import com.toy.blog.service.TestService;

@RestController
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping("/")
    public String hello() {
        return "Hello World!";
    }
	
	@RequestMapping("/test")
    public List<User> testDataBaseConnection() {
		return testService.getUserList();
    }
	
	@RequestMapping("/temp")
    public List<User> testTempData() {
		User user = new User("Eric", 16);
		List<User> list = Arrays.asList(user);
		return list;
    }
}
