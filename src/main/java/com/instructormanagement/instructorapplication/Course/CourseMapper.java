package com.instructormanagement.instructorapplication.Course;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CourseMapper {
    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);
    Course courseDAOToCourse(CourseDAO courseDAO);

    @InheritInverseConfiguration
    CourseDAO courseToCourseDAO(Course course);
}