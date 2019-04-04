package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Question;
import com.example.demo.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	// It give the complete data of question table with person in pages
	@RequestMapping("/{pageNo}")
	@CrossOrigin("http://localhost:4200")
	public Iterable<Question> AllQuestionWithPerson(@PathVariable int pageNo)
	{
		return questionService.AllQuestionsWithPersons(pageNo);
	}
	
	// it return recently asked Question in pages
	@RequestMapping("/recentQuestions/{pageNo}")
	@CrossOrigin("http://localhost:4200")
	public Iterable<Question> LastTwentyRecentlyAskedQuestionsWithPage(@PathVariable int pageNo)
	{
		return questionService.LastTwentyRecentlyAskedQuestionsWithPage(pageNo);
	}
	
	// It return 20 recently asked questions only.
	@RequestMapping("/recentQuestions")
	@CrossOrigin("http://localhost:4200")
	public List<Question> LastTwentyRecentlyAskedQuestions()
	{
		return questionService.LastTwentyRecentlyAskedQuestions();
	}
	
	
	// Last twenty questions of a particular tag
	@RequestMapping(value = "/tag/{tagId}")
	public List<Question> LastTwentyQuestionOfTag(@PathVariable String tagId)
	{
		List<Question> l = questionService.LastTwentyQuestionOfTag(Integer.parseInt(tagId));
		return l;
	}

	// recently asked questions of a particular tag in page(descending, recently asked First)
	@RequestMapping(value = "/tag/{tagId}/{pageNo}")
	public Page<Question> LastTwentyQuestionOfTagWithPage(@PathVariable int tagId, @PathVariable int pageNo)
	{
		return questionService.LastTwentyQuestionOfTagWithPage(tagId, pageNo);
	}
	
}
