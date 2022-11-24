package ru.gb.jseminar8.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.gb.jseminar8.utils.StudentGroupFactory;

import java.io.IOException;

class StudentGroupFactoryTest {

    StudentGroupFactory studentGroupFactory;

    @BeforeEach
    void setUp() {
        studentGroupFactory = new StudentGroupFactory();
    }

    @Test
    void orderStudents() throws IOException {
        studentGroupFactory.orderStudents(10).forEach(System.out::println);
    }
}