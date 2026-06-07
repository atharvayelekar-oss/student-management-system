package com.studentmanagement.sms.service;

import com.studentmanagement.sms.dto.StudentDto;
import com.studentmanagement.sms.entity.Student;
import org.springframework.data.domain.Page;

import java.util.List;

public interface StudentService {

    Student createStudent(StudentDto dto);

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student updateStudent(Long id, StudentDto dto);

    void deleteStudent(Long id);

    List<Student> searchStudents(String name);

    Page<Student> getStudents(int page, int size);

    List<Student> sortStudents(String field);

    Page<Student> getStudentsWithPaginationAndSorting(
            int page,
            int size,
            String field);
}