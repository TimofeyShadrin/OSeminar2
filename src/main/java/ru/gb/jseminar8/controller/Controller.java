package ru.gb.jseminar8.controller;

import ru.gb.jseminar8.data.Student;
import ru.gb.jseminar8.data.StudyGroup;
import ru.gb.jseminar8.data.Teacher;
import ru.gb.jseminar8.data.User;
import ru.gb.jseminar8.service.StudyGroupService;
import ru.gb.jseminar8.service.UserService;
import ru.gb.jseminar8.utils.StudentGroupFactory;
import ru.gb.jseminar8.view.StudentView;
import ru.gb.jseminar8.view.StudyGroupView;

import java.io.IOException;
import java.util.List;

public class Controller {

    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();
    private final StudyGroupService studyGroupService = new StudyGroupService();
    private final StudentGroupFactory studentGroupFactory = new StudentGroupFactory();
    private final StudyGroupView studyGroupView = new StudyGroupView();

    public void createUser (String firstName, String lastName, String patronymic) {
        userService.createUser(firstName, lastName, patronymic);
        List<User> students = userService.getAll();
        studentView.sendOnConsole(students);
    }

    public void createStudyGroup(String firstName, String lastName, String patronymic, Integer sizeOfGroup)
            throws IOException {
        Teacher teacher = new Teacher(firstName, lastName, patronymic);
        List<Student> students = studentGroupFactory.orderStudents(sizeOfGroup);
        studyGroupService.createStudyGroup(teacher, students);
        List<StudyGroup> studyGroup = studyGroupService.getStudyGroups();
        studyGroupView.sendOnConsole(studyGroup);
    }
}
