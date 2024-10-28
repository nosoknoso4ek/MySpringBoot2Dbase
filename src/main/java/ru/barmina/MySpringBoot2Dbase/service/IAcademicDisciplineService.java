package ru.barmina.MySpringBoot2Dbase.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ru.barmina.MySpringBoot2Dbase.entity.AcademicDiscipline;

@Service
public interface IAcademicDisciplineService {

    List<AcademicDiscipline> getAllDisciplines();

    AcademicDiscipline saveDiscipline(AcademicDiscipline academicDiscipline);

    AcademicDiscipline getDiscipline(int id);

    void deleteDiscipline(int id);
}