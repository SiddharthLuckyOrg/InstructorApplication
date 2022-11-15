package com.instructormanagement.instructorapplication.Course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    //@Autowired
    //private CourseMapper courseMapper;

    public List<CourseDTO> getCourses() {
        List<CourseDTO> courses = new ArrayList<>();
        // List<CourseDAO> courseDAOList = courseRepository.findAll();
        // for(CourseDAO courseDAO : courseDAOList) {
        //     CourseDTO course = courseMapper.courseDAOToCourse(courseDAO);
        //     courses.add(course);
        // }
        return courses;
    }

    public void saveCourse(CourseDTO course) {
        // CourseDAO courseDao = courseMapper.courseToCourseDAO(course);
        // courseRepository.save(courseDao);
    }
    
}
