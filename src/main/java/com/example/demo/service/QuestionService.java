package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Question;
import com.example.demo.repository.QuestionRepository;


@Component
public class QuestionService {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	
	public List<Question> AllQuestionsWithPersons()
	{
		return questionRepository.findAll();
	}


	public List<Question> LastTwentyRecentlyAskedQuestions() {
		
		return questionRepository.findTop20ByOrderByQuestionIdDesc();
	}


	public List<Question> LastTwentyQuestionOfTag(int tagId) {
		
		return questionRepository.findTop20ByTagIdOrderByQuestionIdDesc(tagId);
	}
}
