package com.toy.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/")
    public String hello() {
        return "Hello Siwon!";
    }
	
	@RequestMapping("/new")
    public String newPath() {
        return "Hello Minju!";
    }
	
}
