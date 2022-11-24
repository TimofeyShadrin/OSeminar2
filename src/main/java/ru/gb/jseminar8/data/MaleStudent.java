package ru.gb.jseminar8.data;

import ru.gb.jseminar8.utils.Gender;

public class MaleStudent extends Student {

    private final Gender gender = Gender.MALE;

    public MaleStudent(String firstName, String lastName, String patronymic) {
        super(firstName, lastName, patronymic);
    }

    public Gender getGender() {
        return gender;
    }
}
