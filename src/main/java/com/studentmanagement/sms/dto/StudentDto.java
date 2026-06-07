package com.studentmanagement.sms.dto;

import com.studentmanagement.sms.entity.Address;
import com.studentmanagement.sms.entity.Course;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class StudentDto {

    private Long id;

    private String name;

    private LocalDate dateOfBirth;

    private String gender;

    private String studentCode;

    private String email;

    private String mobileNumber;

    private String parentName;

    private List<Address> addresses;

    private List<Course> courses;
}