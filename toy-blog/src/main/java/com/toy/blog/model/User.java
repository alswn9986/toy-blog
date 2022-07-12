package com.toy.blog.model;

public class User {
	// 임시 생성자
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 필드
    private String name;
    private int age;
    
    // 임시 getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}