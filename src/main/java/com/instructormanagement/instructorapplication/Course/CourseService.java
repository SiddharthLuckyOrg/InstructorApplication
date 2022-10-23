package com.instructormanagement.instructorapplication.Course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService {
    public List<Course> getCourses() {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course(1, "Sid", "Sid Description"));
        return courses;
    }
}
