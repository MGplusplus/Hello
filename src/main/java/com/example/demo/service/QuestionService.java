package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.example.demo.model.Question;
import com.example.demo.repository.IQuestionRepository;


@Component
public class QuestionService {
	
	@Autowired
	private IQuestionRepository questionRepository;
	
	
	public Iterable<Question> AllQuestionsWithPersons(int page)
	{
		return (Iterable<Question>) questionRepository.findAll(gotoPage(page));
	}


	public List<Question> LastTwentyRecentlyAskedQuestions() {
		
		return questionRepository.findTop20ByOrderByQuestionIdDesc();
	}


	public List<Question> LastTwentyQuestionOfTag(int tagId) {
		
		return questionRepository.findTop20ByTagIdOrderByQuestionIdDesc(tagId);
	}
	
	// Pagging logic
	private Pageable gotoPage(int page)
	{
		Pageable pageable = PageRequest.of(page, 2);
		return pageable;
	}
	
	// return sorted data, Recently asked question first.(descending order)
	private Pageable gotoPageDesc(int page)
	{
		Pageable pageable = PageRequest.of(page, 2, Sort.by("questionId").descending());
		return pageable;
	}


	public Iterable<Question> LastTwentyRecentlyAskedQuestionsWithPage(int pageNo) {
		return questionRepository.findAll(gotoPageDesc(pageNo));
	}


	public Page<Question> LastTwentyQuestionOfTagWithPage(int tagId, int pageNo) {
		return questionRepository.findByTagIdOrderByQuestionId(tagId, gotoPageDesc(pageNo));
	}
	
	
	
	
}
