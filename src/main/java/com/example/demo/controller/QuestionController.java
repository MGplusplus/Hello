package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Question;
import com.example.demo.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	@RequestMapping("/")
	public List<Question> TopQuestion()
	{
		return questionService.topQuestions();
	}
	
	@RequestMapping("/onlyQuestions")
	public List<Object> OnlyQuestions()
	{
		return questionService.OnlyQuestions();
	}
}
