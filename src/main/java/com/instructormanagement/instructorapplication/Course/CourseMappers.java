package com.instructormanagement.instructorapplication.Course;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CourseMappers {
    
    public static CourseDTO mapCourseDAOtoCourseDTO(CourseDAO courseDAO) {
        ModelMapper modelMapper = new ModelMapper();
        CourseDTO courseDTO = modelMapper.map(courseDAO, CourseDTO.class);
        return courseDTO;
    }

    public static CourseDAO mapCourseDTOtoCourseDAO(CourseDTO courseDTO) {
        ModelMapper modelMapper = new ModelMapper();
        CourseDAO courseDAO = modelMapper.map(courseDTO, CourseDAO.class);
        return courseDAO;
    }
}
