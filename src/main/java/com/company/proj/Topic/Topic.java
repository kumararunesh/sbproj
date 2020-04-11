package com.company.proj.Topic;

public class Topic {
    int id ;
    String name;

    public Topic(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Topic(Topic topic) {
        this.id = topic.id;
        this.name = topic.name;
    }

    public Topic() {

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
