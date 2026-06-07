package com.studentmanagement.sms.service;

import com.studentmanagement.sms.dto.StudentDto;
import com.studentmanagement.sms.entity.Student;
import com.studentmanagement.sms.exception.ResourceNotFoundException;
import com.studentmanagement.sms.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public Student createStudent(StudentDto dto) {

        Student student = new Student();

        student.setName(dto.getName());
        student.setDateOfBirth(dto.getDateOfBirth());
        student.setGender(dto.getGender());
        student.setStudentCode(dto.getStudentCode());
        student.setEmail(dto.getEmail());
        student.setMobileNumber(dto.getMobileNumber());
        student.setParentName(dto.getParentName());
        student.setAddresses(dto.getAddresses());
        student.setCourses(dto.getCourses());

        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {

        return studentRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Student not found with id " + id));
    }

    @Override
    public Student updateStudent(Long id, StudentDto dto) {

        Student student = studentRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Student not found with id " + id));

        student.setName(dto.getName());
        student.setDateOfBirth(dto.getDateOfBirth());
        student.setGender(dto.getGender());
        student.setStudentCode(dto.getStudentCode());
        student.setEmail(dto.getEmail());
        student.setMobileNumber(dto.getMobileNumber());
        student.setParentName(dto.getParentName());
        student.setAddresses(dto.getAddresses());
        student.setCourses(dto.getCourses());

        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {

        Student student = studentRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Student not found with id " + id));

        studentRepository.delete(student);
    }

    @Override
    public List<Student> searchStudents(String name) {
        return studentRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public Page<Student> getStudents(int page, int size) {

        Pageable pageable = PageRequest.of(page, size);

        return studentRepository.findAll(pageable);
    }

    @Override
    public List<Student> sortStudents(String field) {

        return studentRepository.findAll(
                Sort.by(Sort.Direction.ASC, field));
    }

    @Override
    public Page<Student> getStudentsWithPaginationAndSorting(
            int page,
            int size,
            String field) {

        Pageable pageable =
                PageRequest.of(
                        page,
                        size,
                        Sort.by(Sort.Direction.ASC, field));

        return studentRepository.findAll(pageable);
    }
}