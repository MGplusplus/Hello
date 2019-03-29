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
	public List<Question> TopQuestion()
	{
		return questionService.topQuestions();
	}
	
	
	// It give all the questions from question column in question table
	@RequestMapping("/onlyQuestions")
	@CrossOrigin("http://localhost:4200")
	public List<Object> OnlyQuestions()
	{
		return questionService.OnlyQuestions();
	}
	// It give all the questions and  First name of person who asked the question.
	@RequestMapping("/questionsWithPesronName")
	@CrossOrigin("http://localhost:4200")
	public List<Object> QuestionWithCompleteData()
	{
		return questionService.QuestionWithCompleteData();
	}
}
