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
	
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@Temporal(TemporalType.DATE)
	private Date updatedDate;

}
