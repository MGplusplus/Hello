package com.example.demo.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.model.Question;


public interface IQuestionRepository extends JpaRepository<Question, Integer>, PagingAndSortingRepository<Question, Integer>{

	List<Question> findTop20ByOrderByQuestionIdDesc();

	List<Question> findTop20ByTagIdOrderByQuestionIdDesc(int tagId);

	Page<Question> findByTagIdOrderByQuestionId(int tagId, Pageable gotoPageDesc);
}
