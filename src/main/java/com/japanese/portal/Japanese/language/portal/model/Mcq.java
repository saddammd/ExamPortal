package com.japanese.portal.Japanese.language.portal.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="mcq")
public class Mcq {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "question")
	private String question;
	
	@Column(name = "option1")
	private String option1;
	
	@Column(name = "option2")
	private String option2;
	
	@Column(name = "option3")
	private String option3;
	
	@Column(name = "option4")
	private String option4;
	
	@Column(name = "answer")
	private String answer;
	
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@Temporal(TemporalType.DATE)
	private Date updatedDate;

}
