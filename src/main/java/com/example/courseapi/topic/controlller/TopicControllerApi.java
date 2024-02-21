package com.example.courseapi.topic.controlller;

import com.example.courseapi.topic.domain.Topic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface TopicControllerApi {
    @GetMapping("/topics")
    public List<Topic> getAllTopics();

    @GetMapping("/topics/{id}")
    public String getTopicById(@PathVariable String id);

    @PostMapping("topics/{id}")
    public String addTopic(@PathVariable String id, @RequestBody Topic topic);
}

