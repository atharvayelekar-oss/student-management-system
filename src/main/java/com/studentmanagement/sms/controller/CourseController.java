package com.studentmanagement.sms.controller;

import com.studentmanagement.sms.dto.CourseDto;
import com.studentmanagement.sms.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;


    @PostMapping
    public CourseDto addCourse(@RequestBody CourseDto courseDto) {
        return courseService.addCourse(courseDto);
    }


    @GetMapping
    public List<CourseDto> getAllCourses() {
        return courseService.getAllCourses();
    }
}