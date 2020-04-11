package com.company.proj.Topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<Topic>();

    public TopicService() {
        this.topics.add(new Topic(1,"maths"));
        this.topics.add(new Topic(2,"maths"));
        this.topics.add(new Topic(3,"maths"));
        this.topics.add(new Topic(4,"maths"));
    }

    public List<Topic> getAllTopics()
    {
        return topics;
    }

    public Topic getTopic(String id)
    {
        return topics.get(Integer.parseInt(id)-1);
    }

    public List<Topic> addTopic(Topic topic)
    {
        this.topics.add(topic);
        return topics;
    }

    public List<Topic> updateTopic(Topic topic, String id) {
        topics.remove(Integer.parseInt(id)-1);
        this.topics.add(Integer.parseInt(id)-1,topic) ;
        return topics;
    }
}
