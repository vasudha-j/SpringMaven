package com.vasudha.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>( Arrays.asList(new Topic("spring", "springmvc", "springdescriptiomn"),
			new Topic("acbd", "efgh", "ijklmnop"),
			new Topic("124456", "ghdye57hj", "235ghgjhgdfgdgd")));
	
	public List<Topic> getAllTopics(){
		
		return topics;
	}
	
	public Topic getTopic(String id){
		
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		
		for(int i = 0; i < topics.size(); i++){
			Topic t = topics.get(i);
			if(t.getId().equals(id)){
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id, Topic topic) {
//		for(int i = 0; i < topics.size(); i++){
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)){
//				topics.remove(i);
//				return;
//			}
//		}
		
		topics.removeIf(t -> t.getId().equals(id));
	}

	
}
