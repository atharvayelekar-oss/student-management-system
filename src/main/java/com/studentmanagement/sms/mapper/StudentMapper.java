package com.studentmanagement.sms.mapper;

import com.studentmanagement.sms.dto.StudentDto;
import com.studentmanagement.sms.entity.Student;

public class StudentMapper {

    // ENTITY -> DTO
    public static StudentDto mapToStudentDto(Student student) {

        StudentDto dto = new StudentDto();

        dto.setId(student.getId());
        dto.setName(student.getName());
        dto.setDateOfBirth(student.getDateOfBirth());
        dto.setGender(student.getGender());
        dto.setStudentCode(student.getStudentCode());
        dto.setEmail(student.getEmail());
        dto.setMobileNumber(student.getMobileNumber());
        dto.setParentName(student.getParentName());
        dto.setAddresses(student.getAddresses());
        dto.setCourses(student.getCourses());

        return dto;
    }

    // DTO -> ENTITY
    public static Student mapToStudent(StudentDto dto) {

        Student student = new Student();

        student.setId(dto.getId());
        student.setName(dto.getName());
        student.setDateOfBirth(dto.getDateOfBirth());
        student.setGender(dto.getGender());
        student.setStudentCode(dto.getStudentCode());
        student.setEmail(dto.getEmail());
        student.setMobileNumber(dto.getMobileNumber());
        student.setParentName(dto.getParentName());
        student.setAddresses(dto.getAddresses());
        student.setCourses(dto.getCourses());

        return student;
    }
}