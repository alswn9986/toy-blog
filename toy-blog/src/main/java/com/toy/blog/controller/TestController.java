package com.toy.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/")
    public String hello() {
        return "Hello Siwon!";
    }
	
	@RequestMapping("/siwon")
    public String helloSiwonTest() {
        return "Hello Siwon-Test! hmm";
        
    }
	
	@RequestMapping("/new")
    public String newPath() {
        return "Hello Minju!";
    }
	
}
