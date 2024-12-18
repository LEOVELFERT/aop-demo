package com.leo.service;

import com.leo.entity.Student;
import com.leo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> findAllStudents(){
         return studentRepository.findAll();
    }

    public void addStudent(String name){
        studentRepository.save(new Student().setName(name));
    }
}
