package ru.gb.jseminar8.data;

import ru.gb.jseminar8.utils.Gender;

public class FemaleStudent extends Student {

    private final Gender gender = Gender.FEMALE;

    public FemaleStudent(String firstName, String lastName, String patronymic) {
        super(firstName, lastName, patronymic);
    }

    public Gender getGender() {
        return gender;
    }
}
