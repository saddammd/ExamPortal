package com.exam.portal.exam.portal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.portal.exam.portal.entities.FillInTheBlank;

public interface FillInTheBlank_Repository extends JpaRepository<FillInTheBlank, Integer>{

	public FillInTheBlank findFillInTheBlankById(Integer id);
	
}
