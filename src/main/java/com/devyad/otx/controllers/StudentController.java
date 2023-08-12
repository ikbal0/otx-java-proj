package com.devyad.otx.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devyad.otx.beans.Student;

@RestController
public class StudentController {
    public static List<Student> students = new ArrayList<>();

    public StudentController(){
        students.add(new Student("Kim", "Amy"));
        students.add(new Student("Lily", "Andy"));
        students.add(new Student("Fenny", "Lee"));
        students.add(new Student("Andy", "Chn"));
        students.add(new Student("Jin", "Sheol"));
    }

    // http://localhost:8080/students
    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    // http://localhost:8080/student/Lily/Choi
    @GetMapping("/student/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String firstName,
    @PathVariable("lastName") String lastName){
        return new Student(firstName, lastName);
    }

    // http://localhost:8080/student/query?firstName=David&lastName=Woo
    @GetMapping("/student/query")
    public Student studentQueryParam(@RequestParam(name="firstName") String firstName,
    @RequestParam(name="lastName") String lastName){
        return new Student(firstName, lastName);
    }

    // POST http://localhost:8080/student
    @PostMapping("/student")
    public void addStudent(@RequestBody Student student){
        students.add(student);
    }

    @PutMapping("/student/{firstName}")
    public void updateStudent(@PathVariable("firstName") String firstName,
    @RequestBody Student student){
        for(Student stud : students){
            if(stud.getFirstName().equals(firstName)){
                stud.setFirstName(student.getFirstName());
                stud.setLastName(student.getLastName());
            }
        }
    }

    @DeleteMapping("/student/{firstName}")
    public void deleteStudent(@PathVariable("firstName") String firstName){
        for(Student stud: students){
            if(stud.getFirstName().equals(firstName)){
                students.remove(stud);
            }
        }
    }
}
