package com.vasudha.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(new Topic("spring", "springmvc", "springdescriptiomn"),
			new Topic("acbd", "efgh", "ijklmnop"),
			new Topic("124456", "ghdye57hj", "235ghgjhgdfgdgd"));
	
	public List<Topic> getAllTopics(){
		
		return topics;
	}
}
