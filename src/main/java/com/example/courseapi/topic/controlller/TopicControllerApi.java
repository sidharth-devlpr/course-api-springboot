package com.example.courseapi.topic.controlller;

import com.example.courseapi.topic.domain.Topic;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface TopicControllerApi {
    @GetMapping("/topics")
    public List<Topic> getAllTopics();

    @GetMapping("/topics/{id}")
    public Topic getTopicById(@PathVariable String id);

    @PostMapping("/topics/{id}")
    public String addTopic(@PathVariable String id, @RequestBody Topic topic);

    @PutMapping("/topics/{id}")
    public String updateTopic(@PathVariable String id, @RequestBody Topic topic);

    @DeleteMapping("/topics/{id}")
    public String deleteTopic(@PathVariable String id);
}

