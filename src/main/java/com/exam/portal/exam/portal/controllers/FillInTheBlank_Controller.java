package com.exam.portal.exam.portal.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.portal.exam.portal.dto.Add_FillInTheBlank_dto;
import com.exam.portal.exam.portal.dto.Add_Video_dto;
import com.exam.portal.exam.portal.dto.Edit_FillInTheBlank_dto;
import com.exam.portal.exam.portal.dto.Edit_Video_dto;
import com.exam.portal.exam.portal.entities.FillInTheBlank;
import com.exam.portal.exam.portal.entities.Lesson;
import com.exam.portal.exam.portal.entities.Video;
import com.exam.portal.exam.portal.services.FillInTheBlank_Service;
import com.exam.portal.exam.portal.services.Lesson_Service;
import com.exam.portal.exam.portal.services.Video_Service;

@RestController
@RequestMapping("/fillintheblank")
public class FillInTheBlank_Controller {
	
	@Autowired
	Lesson_Service lessonService;
	
	@Autowired
	FillInTheBlank_Service fillInTheBlank_Service;
	
	@PostMapping("/fillintheblank")
	public ResponseEntity<String> addFillInTheBlank(@RequestBody Add_FillInTheBlank_dto addfillintheblankdto){
		
		FillInTheBlank fib = new FillInTheBlank();
		Lesson findLesson = lessonService.findLesson(addfillintheblankdto.getLessonId());
		if(findLesson!=null) {
			fib.setLesson(findLesson);
			BeanUtils.copyProperties(addfillintheblankdto, fib);
			fillInTheBlank_Service.addFillInTheBlank(fib);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Fill In The Blank Added Successfully");
		}
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Lesson Not Found");
		
		
	}
	
	@PutMapping("/fillintheblank")
	public ResponseEntity<String> editFillIntheBlank(@RequestBody Edit_FillInTheBlank_dto editfillintheblankdto){
		
		FillInTheBlank fib = new FillInTheBlank();
		Lesson findLesson = lessonService.findLesson(editfillintheblankdto.getLessonId());
		if(findLesson!=null) {
			fib.setLesson(findLesson);
			BeanUtils.copyProperties(editfillintheblankdto, fib);
			fillInTheBlank_Service.addFillInTheBlank(fib);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Fill In The Blank Added Successfully");
		}
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Lesson Not Found");
		
		
	}
	
	@DeleteMapping("/fillintheblank/{id}")
	public ResponseEntity<String> deleteFillInTheBlank(@PathVariable Integer id){
		
	
	    FillInTheBlank findFillInTheBlank_Service = fillInTheBlank_Service.findFillInTheBlank_Service(id);
		String delteFillInTheBlank = fillInTheBlank_Service.delteFillInTheBlank(findFillInTheBlank_Service);
		return ResponseEntity.status(HttpStatus.OK).body(delteFillInTheBlank);
		
		
	}
	

}
