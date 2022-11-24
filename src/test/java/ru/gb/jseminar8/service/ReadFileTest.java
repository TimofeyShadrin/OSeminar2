package ru.gb.jseminar8.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.gb.jseminar8.utils.Path;
import ru.gb.jseminar8.utils.ReadFile;

import java.io.IOException;

class ReadFileTest{

    ReadFile readFile;

    @BeforeEach
    void setUp() {
        readFile = new ReadFile(Path.FEMALENAME.getPath());
    }

    @Test
    void readRandomRaw() throws IOException {
        System.out.println(readFile.getRandomRaw());
    }
}