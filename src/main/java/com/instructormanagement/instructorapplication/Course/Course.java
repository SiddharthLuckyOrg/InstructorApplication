package com.instructormanagement.instructorapplication.Course;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private Integer id;
    private String username;
    private String description;
}
