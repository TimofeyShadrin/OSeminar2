package ru.gb.jseminar8.utils;

import ru.gb.jseminar8.data.Student;
import ru.gb.jseminar8.data.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentGroupFactory {
    private final SimplyStudentFactory simplyStudentFactory = new SimplyStudentFactory();
    private final Random random = new Random();

    public List<Student> orderStudents (Integer sizeOfGroup) throws IOException {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < sizeOfGroup; i++) {
            boolean choose = random.nextBoolean();
            if (choose) students.add(simplyStudentFactory.createStudent(Gender.MALE));
            else students.add(simplyStudentFactory.createStudent(Gender.FEMALE));
        }
        return students;
    }
}
