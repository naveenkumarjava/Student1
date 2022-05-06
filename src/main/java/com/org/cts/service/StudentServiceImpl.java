package com.org.cts.service;

import com.org.cts.model.Student;
import com.org.cts.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
@Autowired
    StudentRepo studentRepo;
    @Override
    public void createStudent(Student student) {
        studentRepo.save(student);
    }

    @Override
    public List<Student> getAll() {
        List<Student> rrr=studentRepo.findAll();
        return rrr;


    }

    @Override
    public String updateStudent(Student student) {
        studentRepo.save(student);
        return "success";
    }

    @Override
    public String deleteById(Integer id) {
        studentRepo.deleteById(id);
        return "naveen";
    }
}
