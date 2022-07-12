package com.toy.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toy.blog.dao.TestMapper;
import com.toy.blog.model.User;

@Service
public class TestServiceImpl implements TestService {
    
	@Autowired
	private TestMapper testMapper;
 
    @Override
    public List<User> getUserList() {
        return testMapper.getUserList();
    }
}