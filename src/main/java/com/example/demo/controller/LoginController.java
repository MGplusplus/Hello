package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LoginPersonData;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public boolean login(@RequestBody LoginPersonData loginData)
	{
		return true;
	} 
}
