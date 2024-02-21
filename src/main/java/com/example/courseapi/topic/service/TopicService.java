package com.example.courseapi.topic.service;

import com.example.courseapi.topic.domain.Topic;
import com.example.courseapi.topic.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAll(){
        List<Topic> topicList = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topicList::add);
        return topicList;
//         "coming soon";
    }

    public String getTopicById(String id){
        return "";
//        return topicRepository.findById(id);
    }

    public String addTopic(String id, Topic topic) {
        topicRepository.save(topic);
        return "topic added";
    }

    public String deleteTopic(String id) {
        topicRepository.deleteById(id);
        return "deleted";
    }

    public String updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
        return "updated topic id: "+id;
    }
}
