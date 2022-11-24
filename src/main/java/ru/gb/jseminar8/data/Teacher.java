package ru.gb.jseminar8.data;

import java.util.concurrent.atomic.AtomicLong;

public class Teacher extends User {

    private static final AtomicLong tempID = new AtomicLong(0);
    private final Long teacherID;

    public Teacher(String firstName, String lastName, String patronymic) {
        super(firstName, lastName, patronymic);
        this.teacherID = tempID.incrementAndGet();
    }

    public Long getTeacherID() {
        return teacherID;
    }

    @Override
    public String toString() {
        return "\nTeacher{" + "firstName='" + super.getFirstName() +
                ", lastName='" + super.getLastName() +
                ", patronymic='" + super.getPatronymic() +
                ", id=" + teacherID +
                '}';
    }
}
