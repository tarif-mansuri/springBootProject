//$Id$
package org.lemeco.springbootstater.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return Arrays.asList(
				new Topic("Spring", "Spring Framework", "spring Framework Description"),
				new Topic("java", "core java", "core java Description"),
				new Topic("javaScript", "javaScript", "javaScript Description")				
				);
	}
}
