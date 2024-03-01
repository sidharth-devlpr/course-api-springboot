package com.example.courseapi.course.controlller;

import com.example.courseapi.course.domain.Course;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CourseControllerApi {
    @GetMapping("/topics/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable String topicId);

    @GetMapping("/topics/{topicId}/courses/{id}")
    public Course getCourseById(@PathVariable String id);

    @PostMapping("/topics/{topicId}/courses")
    public String addCourse(@PathVariable String topicId, @RequestBody Course topic);

    @PutMapping("/topics/{topicId}/courses/{id}")
    public String updateCourse(@PathVariable String topicId, @RequestBody Course topic);

    @DeleteMapping("/topics/{topicId}/courses/{id}")
    public String deleteCourse(@PathVariable String id);
}

