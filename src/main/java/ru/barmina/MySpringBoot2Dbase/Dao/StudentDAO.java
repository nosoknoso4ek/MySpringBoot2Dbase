package ru.barmina.MySpringBoot2Dbase.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.*;
import lombok.extern.slf4j.Slf4j;
import ru.barmina.MySpringBoot2Dbase.entity.Student;

@Slf4j
@Repository
public class StudentDAO implements IStudentDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Student> getAllStudents() {
        Query query = entityManager.createQuery("from Student");
        List<Student> allStudents =query.getResultList();
        log.info("getAllStudents " +allStudents);
        return allStudents;
    }

    @Override
    public Student saveStudent(Student student) {
        return entityManager.merge(student);
    }

    @Override
    public Student getStudent(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public void deleteStudent(int id) {
        Query query = entityManager.createQuery("delete from Student " +
                "where id =:studentId");
        query.setParameter("studentId", id);
        query.executeUpdate();
    }

}
