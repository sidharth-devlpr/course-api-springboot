package com.example.courseapi.course.service;

import com.example.courseapi.course.domain.Course;
import com.example.courseapi.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAll(){
        List<Course> courseList = new ArrayList<>();
        courseRepository.findAll()
                .forEach(courseList::add);
        return courseList;
//         "coming soon";
    }

    public Course getCourseById(String id){
        Optional<Course> topicOp = courseRepository.findById(id);
        Course course = new Course();
        if (topicOp.isPresent()){
            course = topicOp.get();
        }
        return course;
//        return courseRepository.findById(id);
    }

    public String addCourse(Course course) {
        courseRepository.save(course);
        return "topic added";
    }

    public String updateCourse(Course course) {
        courseRepository.save(course);
        return "updated topic id: ";
    }

    public String deleteCourse(String id) {
        courseRepository.deleteById(id);
        return "deleted";
    }
}
