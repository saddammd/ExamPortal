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
@Table(name="lesson")
public class Lesson {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@Temporal(TemporalType.DATE)
	private Date updatedDate;

}
