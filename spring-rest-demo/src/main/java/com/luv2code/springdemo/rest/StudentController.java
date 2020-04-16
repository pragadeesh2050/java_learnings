package com.luv2code.springdemo.rest;


import com.luv2code.springdemo.entity.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    private List<Student> students;

    @PostConstruct()
    private void loadStudentData(){
        this.students = new ArrayList<Student>();
        Student student = new Student();
        student.setFirstName("Pragadeesh");
        student.setLastName("Chandrasekaran");
        student.setActive(true);
        Student student1 = new Student();
        student1.setFirstName("Vijayalakshmi");
        student1.setLastName("Baskaranarayanan");
        student1.setActive(true);
        students.add(student);
        students.add(student1);
    }

    @RequestMapping("/students")
    public List<Student> getStudents(){

        return students;
    }

    @RequestMapping("/students/{id}")
    public Student getStudent(@PathVariable("id") Integer studentId){
        return students.get(studentId);
    }
}
