package com.leo.controller;

import com.leo.entity.Student;
import com.leo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/student")
public class StudentController {
    private static final Logger log = LoggerFactory.getLogger(StudentController.class);
    private final StudentService studentService;

    @GetMapping("/findAll")
    public List<Student> findAllStudents(){
        return  studentService.findAllStudents();
    }

    @PostMapping("/add/{name}")
    public void addStudent(@PathVariable String name){
        studentService.addStudent(name);
    }
}
