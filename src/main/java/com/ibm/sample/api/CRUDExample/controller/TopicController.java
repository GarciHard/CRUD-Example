package com.ibm.sample.api.CRUDExample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.sample.api.CRUDExample.model.Topic;
import com.ibm.sample.api.CRUDExample.service.impl.TopicServiceImpl;

@RestController
public class TopicController {

	@Autowired
	TopicServiceImpl topicService;
	
	@GetMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAll();
	}
	
	@PostMapping("/topics")
	public void saveTopic(@RequestBody Topic topic) {
		topicService.createTopic(topic);
	}
	
	@GetMapping("/topics/{id}")
	public Optional<Topic> getById(@PathVariable String id) {
		return topicService.readTopic(id);
	}
	
}
