package com.stuudentcrud.studentcrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stuudentcrud.studentcrud.entity.Student;
import com.stuudentcrud.studentcrud.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private Student saveStudent(Student student){
        return StudentRepository.save(student);
    }
    public List<Student> getAllStudents(){
        return StudentRepository.findAll();
    }
    public Student getStudentById(Long id){

        return StudentRepository.findById(id).orElse(null);

    }
    public Student updateStudent(Long id,Studnet updatedStudent){
        Optional<Student> existingStudent=StudentRepository.findById(id);
        if(existingStudent.isPresent()){
            Student student=existingStudent.get();
            Student.setName(updatedstudent.getName());
            Student.setEmail(UpdatedStudent.getEmail());
            Student.setCourse()

        }  
    }   
}
