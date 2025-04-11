package com.stuudentcrud.studentcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stuudentcrud.studentcrud.entity.Student;
import com.stuudentcrud.studentcrud.service.StudentService;

@RestController
@RequestMapping

public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    @GetMapping
    public List<Student> getAllStudents();
    return studentService.getStudentById(id);
}

@GetMapping("/{id}")
public Student getStudentById(@PathVariable Long id){
return studentService.getStudentById(id);

}
@PutMapping
public Student updateStudent(@PathVariable Long id,@RequestBody Student student){
    return studentService.updateStudent(id,student);
}
@DeleteMapping
public String deleteStudnet(@PathVariable Long id){
    studentService.deleteStudent(id);
    return "student deleted successfully";
}
