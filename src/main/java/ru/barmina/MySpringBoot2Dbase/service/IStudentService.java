package ru.barmina.MySpringBoot2Dbase.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ru.barmina.MySpringBoot2Dbase.entity.Student;

@Service
public interface IStudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}
