package ru.gb.jseminar8.service;

import ru.gb.jseminar8.data.Student;
import ru.gb.jseminar8.data.StudyGroup;
import ru.gb.jseminar8.data.Teacher;

import java.util.List;

public interface StudyGroupDataService {

    void createStudyGroup(Teacher teacher, List<Student> studentList);

    List<StudyGroup> getStudyGroups();
}
