package ru.barmina.MySpringBoot2Dbase.Dao;
import ru.barmina.MySpringBoot2Dbase.entity.Student;


import java.util.List;


public interface IStudentDAO {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}
