package com.example.courseapi.course.domain;

import com.example.courseapi.topic.domain.Topic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    private String id;
    private String name;
    private String description;

    private Topic Topic;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course() {
    }

    public Course(String id, String name, String description, String topicid) {
        this.id = id;
        this.name = name;
        this.description = description;
        Topic topic = new Topic(topicid, "", "");
    }
}
