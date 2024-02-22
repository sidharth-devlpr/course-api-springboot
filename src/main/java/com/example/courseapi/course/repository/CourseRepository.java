package com.example.courseapi.course.repository;

import com.example.courseapi.course.domain.Course;
import org.springframework.data.repository.CrudRepository;


public interface CourseRepository extends CrudRepository<Course, String> {
}
