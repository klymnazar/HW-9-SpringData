package com.lits.springboot.service;

import com.lits.springboot.dto.CourseDto;
import com.lits.springboot.dto.TeacherDto;

import java.util.List;

public interface TeacherService {

    TeacherDto getOne(Integer id);
    TeacherDto update(Integer id, String newFirstName, String newLastName);
    void delete(Integer id);
    List<TeacherDto> getAll(String sortBy);
    TeacherDto create(String firstName, String lastName, Integer age);

    TeacherDto addCourseToTeacher(Integer teacherId, List<Integer> courseIds);
}
