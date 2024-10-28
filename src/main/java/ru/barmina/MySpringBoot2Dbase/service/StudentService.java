package ru.barmina.MySpringBoot2Dbase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import ru.barmina.MySpringBoot2Dbase.Dao.StudentDAO;
import ru.barmina.MySpringBoot2Dbase.entity.Student;

@Service
public class StudentService implements IStudentService{

    @Autowired
    private StudentDAO studentDAO;

    @Override
    @Transactional
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    @Override
    @Transactional
    public Student saveStudent(Student student) {
        return studentDAO.saveStudent(student);
    }

    @Override
    @Transactional
    public Student getStudent(int id) {
        return studentDAO.getStudent(id);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
        studentDAO.deleteStudent(id);
    }


}
