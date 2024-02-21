package com.example.courseapi.topic.controlller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @GetMapping("/topics")
    public String getAllTopics(){
        return "coming soon";
    }
}
