package com.instructormanagement.instructorapplication.Course;

import org.springframework.stereotype.Component;

@Component
public class CourseMapperImpl implements CourseMapper{

    @Override
    public Course courseDAOToCourse(CourseDAO courseDAO) {
        Course course = new Course();
        course.setId(courseDAO.getId());
        course.setDescription(courseDAO.getDescription());
        course.setUsername(courseDAO.getUsername());
        return course;
    }

    @Override
    public CourseDAO courseToCourseDAO(Course course) {
        CourseDAO courseDAO = new CourseDAO();
        courseDAO.setDescription(course.getDescription());
        courseDAO.setUsername(course.getUsername());
        return courseDAO;
    }
    
}
