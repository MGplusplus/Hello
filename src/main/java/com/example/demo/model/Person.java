package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="t_person")
public class Person implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="c_person_id")
	private int personId;
	
	@Column(name="c_role_id")
	private int roleId;
	
	@Column(name="c_status_id")
	private int statusId;
	
	@Column(name="c_firstname")
	private String firstname;
	
	@Column(name="c_middlename")
	private String middlename;
	
	@Column(name="c_lastname")
	private String lastname;
	
	@Column(name="c_nickname")
	private String nickname;
	
	@Column(name="c_cdac_conn_id")
	private int cdacConnId;
	
	@Column(name="email_id")
	private String email;
	
	@Column(name="c_password")
	private String password;
	
	@Column(name="c_job_experience")
	private String jobExperience;
	
	@Column(name="c_job_year_exp")
	private Integer jobYearExp;
	
	@Column(name="c_job_tech")
	private String jobTech;
	
	@Column(name="c_mobile_no")
	private Integer mobileNo;
	
	@Column(name="c_mobile_show_bit")
	private Integer mobileShowBit;
	
	@Column(name="c_cdac_experience")
	private String cdacExperience;
	
	@Column(name="c_batch_id")
	private Integer batchId;
	
}
