package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@RestController
@RequestMapping("/member")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping("/")
	public List<Person> getRandomMembers()
	{
		return personService.getRandomMembers();
	}
}
