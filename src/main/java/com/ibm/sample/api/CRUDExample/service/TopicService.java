package com.ibm.sample.api.CRUDExample.service;

import java.util.List;
import java.util.Optional;

import com.ibm.sample.api.CRUDExample.model.Topic;

public interface TopicService {

	List<Topic> getAll();
	
	void createTopic(Topic topic);
	
	Optional <Topic> readTopic(String id);
	
	void updateTopic(String id);
	
	void deleteTopic(String id);
}
