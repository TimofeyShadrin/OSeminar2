package ru.gb.jseminar8.utils;

import ru.gb.jseminar8.data.*;

import java.io.IOException;

public class SimplyStudentFactory {
    public Student createStudent(Gender gender) throws IOException {
        Student student = null;

        switch (gender) {
            case MALE:
                student = new MaleStudent(
                        new ReadFile(Path.MALENAME.getPath()).getRandomRaw(),
                        new ReadFile(Path.LASTNAME.getPath()).getRandomRaw(),
                        new ReadFile(Path.MALEPATRONYMIC.getPath()).getRandomRaw()
                );

                break;
            case FEMALE:
                student = new FemaleStudent(
                        new ReadFile(Path.FEMALENAME.getPath()).getRandomRaw(),
                        new ReadFile(Path.LASTNAME.getPath()).getRandomRaw() + 'а',
                        new ReadFile(Path.FEMALEPATRONYMIC.getPath()).getRandomRaw()

                );
                break;
        }
        return student;
    }
}
