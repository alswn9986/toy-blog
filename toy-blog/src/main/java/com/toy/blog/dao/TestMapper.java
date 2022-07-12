package com.toy.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.toy.blog.model.User;

@Repository
@Mapper
public interface TestMapper {
    List<User> getUserList();
}