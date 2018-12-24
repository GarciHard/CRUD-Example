package com.ibm.sample.api.CRUDExample.dao;

import org.springframework.data.repository.CrudRepository;

import com.ibm.sample.api.CRUDExample.model.Topic;

public interface TopicDAO extends CrudRepository<Topic, String>{
	
}
