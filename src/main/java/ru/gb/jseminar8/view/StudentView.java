package ru.gb.jseminar8.view;

import ru.gb.jseminar8.data.User;

import java.util.List;
import java.util.logging.Logger;

public class StudentView {

    public void sendOnConsole(List<User> users) {
        Logger logger = Logger.getAnonymousLogger();

        for (User user : users) {
            logger.info(user.toString());
        }
    }
}
