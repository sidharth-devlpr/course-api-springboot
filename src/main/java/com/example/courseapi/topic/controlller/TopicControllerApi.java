package com.example.courseapi.topic.controlller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface TopicControllerApi {
    @GetMapping("/topics")
    public String getAllTopics();

    @GetMapping("/topics/{id}")
    public String getTopicById(@PathVariable String id);
}

