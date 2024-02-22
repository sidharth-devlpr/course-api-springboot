package com.example.courseapi.course.controlller;

import com.example.courseapi.course.domain.Course;
import com.example.courseapi.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController implements CourseControllerApi {
    @Autowired
    private CourseService courseService;

    @Override
    public List<Course> getAllCourses(){
        return courseService.getAll();
    }

    @Override
    public Course getCourseById(@PathVariable String id){
        return courseService.getCourseById(id);
    }

    @Override
    public String addCourse(@PathVariable String id, @RequestBody Course course){
        return courseService.addCourse(id, course);
    }

    public String updateCourse(@PathVariable String id, @RequestBody Course course){
        return courseService.updateCourse(id,course);
    }

    public String deleteCourse(@PathVariable String id){
        return courseService.deleteCourse(id);
    }


}
