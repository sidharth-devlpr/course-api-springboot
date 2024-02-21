package com.example.courseapi.topic.repository;

import com.example.courseapi.topic.domain.Topic;
import org.springframework.data.repository.CrudRepository;


public interface TopicRepository extends CrudRepository<Topic, String> {
}
