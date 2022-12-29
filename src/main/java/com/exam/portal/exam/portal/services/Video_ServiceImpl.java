package com.exam.portal.exam.portal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.portal.exam.portal.dao.Video_Repository;
import com.exam.portal.exam.portal.entities.Video;

@Service
public class Video_ServiceImpl implements Video_Service {
	
	@Autowired
	private Video_Repository video_repository;

	@Override
	public Video addVideo(Video video) {
		
		return video_repository.save(video);
	}

}
