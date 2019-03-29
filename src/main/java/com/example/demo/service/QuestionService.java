package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.model.Question;
import com.example.demo.repository.QuestionRepository;


@Component
public class QuestionService {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	
	public List<Question> topQuestions()
	{
		return questionRepository.findAll();
	}


	public List<Object> OnlyQuestions() {
		// TODO Auto-generated method stub
		return questionRepository.OnlyQuestions();
	}


	public List<Object> QuestionWithCompleteData() {
		
		return questionRepository.QuestionWithCompleteData();
	}
}
