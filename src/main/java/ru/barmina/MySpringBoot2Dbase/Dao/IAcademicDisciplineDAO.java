package ru.barmina.MySpringBoot2Dbase.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import ru.barmina.MySpringBoot2Dbase.entity.AcademicDiscipline;

@Repository
public interface IAcademicDisciplineDAO {

    List<AcademicDiscipline> getAllDisciplines();
    AcademicDiscipline saveDiscipline(AcademicDiscipline academicDiscipline);
    AcademicDiscipline getDiscipline(int id);
    void deleteDiscipline(int id);
}
