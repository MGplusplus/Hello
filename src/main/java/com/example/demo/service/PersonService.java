package com.example.demo.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

@Component
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public List<Person> getRandomMembers() {
		
		int[] index = new Random().ints(0, 5, 10).toArray();
		//int[] like =  new Random().
		
		System.out.println(index);
		
		int indexs = 1;
		
		return personRepository.findFirst5OrderByPersonId(indexs);
	}
	
	

}
