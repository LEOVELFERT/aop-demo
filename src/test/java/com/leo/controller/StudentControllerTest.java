package com.leo.controller;

import com.leo.entity.Student;
import com.leo.service.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class StudentControllerTest {

    @Mock
    private StudentService studentService;

    @InjectMocks
    private StudentController studentController;

    @Test
    public void findAllStudentTest() throws NoSuchMethodException {
        List<Student> students = Collections.singletonList(new Student(1, "John Doe"));

        Mockito.when(studentService.findAllStudents()).thenReturn(students);

        List<Student> allStudents = studentController.findAllStudents();

        Assertions.assertNotNull(allStudents);

        Method findAllStudents = StudentService.class.getDeclaredMethod("findAllStudents", StudentController.class);
    }
}
