package ru.gb.jseminar8;

import ru.gb.jseminar8.controller.Controller;

import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {
        Controller controller = new Controller();
        controller.createStudyGroup(
                "Петр",
                "Толстой",
                "Иванович",
                19);
        controller.createStudyGroup(
                "Ivan",
                "Petrov",
                "Jovanovich",
                17);
        controller.createStudyGroup(
                "Ivan",
                "Petrov",
                "Jovanovich",
                18);
    }
}
