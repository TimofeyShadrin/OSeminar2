package ru.gb.jseminar8.service;

import ru.gb.jseminar8.data.Student;
import ru.gb.jseminar8.data.StudyGroup;
import ru.gb.jseminar8.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService implements StudyGroupDataService {

    List<StudyGroup> studyGroups;

    public StudyGroupService() {
        this.studyGroups = new ArrayList<>();
    }

    @Override
    public void createStudyGroup(Teacher teacher, List<Student> studentList) {
        this.studyGroups.add(new StudyGroup(teacher, studentList));
    }

    @Override
    public List<StudyGroup> getStudyGroups() {
        return this.studyGroups;
    }
}
