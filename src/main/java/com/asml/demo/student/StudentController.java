package com.asml.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/*
    return to the client the list of students
 */
@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping
    public List<Student> gelAllStudents() {
        return List.of(new Student(UUID.randomUUID(), "cemil", "gtgk", "maili@gmail.com", Student.Gender.MALE),
                new Student(UUID.randomUUID(), "cemil", "gtgk", "maili@gmail.com", Student.Gender.MALE));
    }
}
