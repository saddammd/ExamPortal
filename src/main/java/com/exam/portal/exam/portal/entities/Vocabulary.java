package com.exam.portal.exam.portal.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;

  
  @Entity
  @Table(name="vocabulary") 
  public class Vocabulary {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id") 
  private Integer id;
  
  @Column(name="japanese_character") 
  private String japanese_character;
  
  @Column(name="english_character") 
  private String english_character;
  
  @ManyToOne
  @JoinColumn(name = "lesson_id")
  @JsonBackReference
  private Lesson lesson;
  
  @Temporal(TemporalType.DATE) 
  private Date createdDate;
  
  @Temporal(TemporalType.DATE) 
  private Date updatedDate;

public Vocabulary() {
	super();
	// TODO Auto-generated constructor stub
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getJapanese_character() {
	return japanese_character;
}

public void setJapanese_character(String japanese_character) {
	this.japanese_character = japanese_character;
}

public String getEnglish_character() {
	return english_character;
}

public void setEnglish_character(String english_character) {
	this.english_character = english_character;
}

public Lesson getLesson() {
	return lesson;
}

public void setLesson(Lesson lesson) {
	this.lesson = lesson;
}

public Date getCreatedDate() {
	return createdDate;
}

public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}

public Date getUpdatedDate() {
	return updatedDate;
}

public void setUpdatedDate(Date updatedDate) {
	this.updatedDate = updatedDate;
}
  
  
  
  }
 