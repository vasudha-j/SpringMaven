package com.vasudha.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopic(){
 
		return Arrays.asList(new Topic("spring", "springmvc", "springdescriptiomn"),
				new Topic("acbd", "efgh", "ijklmnop"),
				new Topic("124456", "ghdye57hj", "235ghgjhgdfgdgd"));
		
	}
}
