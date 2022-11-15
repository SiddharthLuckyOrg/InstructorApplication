package com.instructormanagement.instructorapplication.Course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    
    public List<CourseDTO> getCourses() {
        List<CourseDTO> courses = new ArrayList<>();
        List<CourseDAO> courseDAOList = courseRepository.findAll();
        for(CourseDAO courseDAO : courseDAOList) {
            CourseDTO course = CourseMappers.mapCourseDAOtoCourseDTO(courseDAO);
            courses.add(course);
        }
        return courses;
    }

    public void saveCourse(CourseDTO course) {
        CourseDAO courseDao = CourseMappers.mapCourseDTOtoCourseDAO(course);
        courseRepository.save(courseDao);
    }
    
}
