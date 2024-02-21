package com.example.courseapi.topic.controlller;

import com.example.courseapi.topic.domain.Topic;
import com.example.courseapi.topic.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicControllerController implements TopicControllerApi {
    @Autowired
    private TopicService topicService;

    @Override
    public List<Topic> getAllTopics(){
        return topicService.getAll();
    }

    @Override
    public String getTopicById(@PathVariable String id){
        return topicService.getTopicById(id);
    }

    @Override
    public String addTopic(@PathVariable String id, @RequestBody Topic topic){
        return topicService.addTopic(id, topic);
    }

    public String deleteTopic(@PathVariable String id){
        return topicService.deleteTopic(id);
    }


}
