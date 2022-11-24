package ru.gb.jseminar8.data;

import java.util.concurrent.atomic.AtomicLong;

public class Student extends User {

    private static final AtomicLong studentID = new AtomicLong(0);
    private final Long id;

    public Student(String firstName, String lastName, String patronymic) {
        super(firstName, lastName, patronymic);
        this.id = studentID.incrementAndGet();
    }

    public Long getStudentID() {
        return id;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "firstName='" + super.getFirstName() +
                ", lastName='" + super.getLastName() +
                ", patronymic='" + super.getPatronymic() +
                ", id=" + this.id +
                "}";
    }
}
