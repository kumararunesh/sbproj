package com.company.proj.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TopicController {
    @Autowired
    public TopicService topicService;

@RequestMapping("/showTopics1")
    public List<Topic> show()
    {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{foo}")
    public Topic getTopic(@PathVariable("foo") String id) // recc to have ame name as id.
    {
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST ,value = "/topics")
    public List<Topic> addTopic(@RequestBody Topic topic)
    {
      return topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT ,value = "/topics/{id}")
    public List<Topic> updateTopic(@RequestBody Topic topic ,@PathVariable String id)
    {
        return topicService.updateTopic(topic,id);
    }
}
