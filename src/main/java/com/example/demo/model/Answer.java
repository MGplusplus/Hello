package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="t_answers")
public class Answer {

	@Id
	@GeneratedValue
	@Column(name="c_ans_id")
	private int answerId;
	
	@Column(name="c_qid")
	private int questionId;
	
	@Column(name="c_person_id")
	private int personId;
	
	@Column(name="c_status_id")
	private int statusId;
	
	@Column(name="c_tag_id")
	private int tagId;
	
	@Column(name="c_adob")
	private String answerDOB;
	
}
