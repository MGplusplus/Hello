package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Person;
import com.example.demo.repository.IPersonRepository;

@Component
public class PersonService {

	@Autowired
	private IPersonRepository personRepository;
	
	public List<Person> getRandomMembers() {
		return personRepository.findFirst5ByOrderByPersonIdDesc();
	}
	
	

}
