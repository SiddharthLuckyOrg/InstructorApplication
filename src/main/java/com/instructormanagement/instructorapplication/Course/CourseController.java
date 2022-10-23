package com.instructormanagement.instructorapplication.Course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/instructors")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping(value = "/apicheck")
    public String apiCheck() {
        return "Controller Hit";
    }

    @GetMapping(value = "/getcourses")
    public List<Course> getCourses() {
        return courseService.getCourses();
    }
}