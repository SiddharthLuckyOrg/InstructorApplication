package com.instructormanagement.instructorapplication.Course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/instructors")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping(value = "/apicheck")
    public String apiCheck() {
        return "Controller Hit";
    }

    @GetMapping(value = "/getcourses")
    public List<CourseDTO> getCourses() {
        return courseService.getCourses();
    }

    @PostMapping(value = "/savecourse/{course}")
    public String saveCourse(@RequestBody CourseDTO course) {
        courseService.saveCourse(course);
        return "The value is saved";
    }
}