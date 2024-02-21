package com.example.courseapi.topic.controlller;

import com.example.courseapi.topic.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicControllerController implements TopicControllerApi {
    @Autowired
    private TopicService topicService;

    @Override
    public String getAllTopics(){
        return topicService.getAll();
    }

    @Override
    public String getTopicById(@PathVariable String id){
        return topicService.getTopicById(id);
    }
}
