package com.toy.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.toy.blog.mapper.TestMapper;
import com.toy.blog.model.User;

@Service
@Transactional
public class TestService {
    
	@Autowired
	private TestMapper testMapper;
	
    public List<User> getUserList() {
        return testMapper.getUserList();
    }
}