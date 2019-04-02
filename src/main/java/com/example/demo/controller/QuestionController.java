package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Question;
import com.example.demo.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	// It give the complete data of question table
	@RequestMapping("/")
	@CrossOrigin("http://localhost:4200")
	public List<Question> TopRecentQuestionWithPerson()
	{
		return questionService.AllQuestionsWithPersons();
	}
	
}
