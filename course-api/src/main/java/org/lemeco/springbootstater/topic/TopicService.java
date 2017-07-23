//$Id$
package org.lemeco.springbootstater.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics =new ArrayList<Topic> (Arrays.asList(
			new Topic("spring", "Spring Framework", "spring Framework Description"),
			new Topic("java", "core java", "core java Description"),
			new Topic("javaScript", "javaScript", "javaScript Description")				
			));
	public List<Topic> getAllTopcs()
	{
		return topics;
	}
	public Topic getTopic(String id){
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}
	public void updateTopic(String id, Topic topic) {
		for(int i=0; i<topics.size(); i++)
		{
			if(topics.get(i).getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}
		}
		
	}
	public void deleteTopic(String id) {
		
		topics.removeIf(t->t.getId().equals(id));
	}
}
