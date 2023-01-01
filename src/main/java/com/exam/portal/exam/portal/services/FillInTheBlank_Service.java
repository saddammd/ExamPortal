package com.exam.portal.exam.portal.services;

import com.exam.portal.exam.portal.entities.FillInTheBlank;

public interface FillInTheBlank_Service {

	public FillInTheBlank addFillInTheBlank(FillInTheBlank fib);

	public FillInTheBlank findFillInTheBlank_Service(Integer id);
	
	public String delteFillInTheBlank(FillInTheBlank fib);

}
