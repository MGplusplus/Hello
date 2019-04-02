package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "t_questions")
public class Question{

	 @Id
	 @GeneratedValue
	 @Column(name="c_qid")
	 private int questionId;
	 
	 @ManyToOne(fetch = FetchType.LAZY, optional = false)
	 @JoinColumn(name = "c_person_id", referencedColumnName= "c_person_id" ,nullable = false) 
	 @Fetch(FetchMode.JOIN)
	 private Person person;
	 
	 @Column(name="c_status_id") 
	 private int statusId;
	 
	 @Column(name="c_tag_id") 
	 private int tagId;
	 
	 @Column(name="c_qdob") 
	 private String QuestionDOB;
	 
	 @Column(name="c_question_desc") 
	 private String questionDesc;
	
	
	 public Question(String questionDesc)
	 {
		 this.questionDesc = questionDesc;
	 }
}
