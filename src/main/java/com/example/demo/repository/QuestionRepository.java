package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Question;


public interface QuestionRepository extends JpaRepository<Question, Integer>{

	@Query(value = "Select c_question_desc FROM t_questions", nativeQuery = true)
	public List<Object> OnlyQuestions();

	@Query(value = "select q.c_question_desc, p.c_firstname\r\n" + 
			"	from t_questions q\r\n" + 
			"	INNER JOIN t_person p on q.c_person_id = p.c_person_id", nativeQuery = true)
	public List<Object> QuestionWithCompleteData();

}
