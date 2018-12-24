package com.ibm.sample.api.CRUDExample.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.sample.api.CRUDExample.dao.TopicDAO;
import com.ibm.sample.api.CRUDExample.model.Topic;
import com.ibm.sample.api.CRUDExample.service.TopicService;

@Service
public class TopicServiceImpl implements TopicService {

	@Autowired
	TopicDAO topicDao;

	@Override
	public List<Topic> getAll() {
		List<Topic> topicObj = new ArrayList<>();
		topicDao.findAll().forEach(topicObj::add);
		
		return topicObj;
	}

	@Override
	public void createTopic(Topic topic) {
		topicDao.save(topic);
	}

	@Override
	public Optional<Topic> readTopic(String id) {
		return topicDao.findById(id);
	}

	@Override
	public void updateTopic(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		
	}
	
}
