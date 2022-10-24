package com.instructormanagement.instructorapplication.Course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private CourseMapper courseMapper;

    public List<Course> getCourses() {
        List<Course> courses = new ArrayList<>();
        List<CourseDAO> courseDAOList = courseRepository.findAll();
        for(CourseDAO courseDAO : courseDAOList) {
            Course course = courseMapper.courseDAOToCourse(courseDAO);
            courses.add(course);
        }
        return courses;
    }

    public void saveCourse(Course course) {
        CourseDAO courseDao = courseMapper.courseToCourseDAO(course);
        courseRepository.save(courseDao);
    }
}
