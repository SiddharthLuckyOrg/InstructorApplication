package com.instructormanagement.instructorapplication.Course;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @ApiModelProperty(readOnly = true)
    private int id;
    private String username;
    private String description;
}
