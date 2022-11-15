package com.instructormanagement.instructorapplication.Course;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.AccessMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseDTO {
    @Schema(accessMode = AccessMode.READ_ONLY)    
    private int id;
    private String username;
    private String description;
}
