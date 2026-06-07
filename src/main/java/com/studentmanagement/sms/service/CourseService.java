package com.studentmanagement.sms.service;

import com.studentmanagement.sms.dto.CourseDto;
import com.studentmanagement.sms.entity.Course;
import com.studentmanagement.sms.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    // ADD COURSE
    public CourseDto addCourse(CourseDto courseDto) {

        Course course = new Course();

        course.setName(courseDto.getName());
        course.setDuration(courseDto.getDuration());

        Course savedCourse = courseRepository.save(course);

        CourseDto dto = new CourseDto();

        dto.setId(savedCourse.getId());
        dto.setName(savedCourse.getName());
        dto.setDuration(savedCourse.getDuration());

        return dto;
    }

    // GET ALL COURSES
    public List<CourseDto> getAllCourses() {

        return courseRepository.findAll()
                .stream()
                .map(course -> {
                    CourseDto dto = new CourseDto();

                    dto.setId(course.getId());
                    dto.setName(course.getName());
                    dto.setDuration(course.getDuration());

                    return dto;
                })
                .collect(Collectors.toList());
    }
}