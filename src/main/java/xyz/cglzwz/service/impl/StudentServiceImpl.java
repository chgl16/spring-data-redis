package xyz.cglzwz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.cglzwz.dao.StudentRepository;
import xyz.cglzwz.domain.Student;
import xyz.cglzwz.service.StudentService;

import java.util.ArrayList;
import java.util.List;

/**
 * 增删改查业务实现
 *
 * @author chgl16
 * @date 2019-01-25 21:39
 * @version 1.0
 */

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void create(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student retrieve(String id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void update(Student student) {
        Student retrieveStudent = studentRepository.findById(student.getId()).get();
        if (student.getName() != null) {
            retrieveStudent.setName(student.getName());
        }
        if (student.getGrade() != null) {
            retrieveStudent.setGrade(student.getGrade());
        }
        studentRepository.save(retrieveStudent);
    }

    @Override
    public void delete(String id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<Student>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }
}
