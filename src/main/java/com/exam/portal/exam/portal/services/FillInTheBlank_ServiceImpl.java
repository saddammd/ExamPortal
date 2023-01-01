package com.exam.portal.exam.portal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.portal.exam.portal.dao.FillInTheBlank_Repository;
import com.exam.portal.exam.portal.entities.FillInTheBlank;

@Service
public class FillInTheBlank_ServiceImpl implements FillInTheBlank_Service {

	
	@Autowired
	private FillInTheBlank_Repository fillInTheBlank_Repository;
	
	@Override
	public FillInTheBlank addFillInTheBlank(FillInTheBlank fib) {
		
		FillInTheBlank save = fillInTheBlank_Repository.save(fib);
		
		return save;
	}

	@Override
	public FillInTheBlank findFillInTheBlank_Service(Integer id) {
		FillInTheBlank findFillInTheBlankById = fillInTheBlank_Repository.findFillInTheBlankById(id);
		return findFillInTheBlankById;
	}

	@Override
	public String delteFillInTheBlank(FillInTheBlank fib) {
		fillInTheBlank_Repository.delete(fib);
		return "Fill In The Blank Deleted Successfully";
	}

}
