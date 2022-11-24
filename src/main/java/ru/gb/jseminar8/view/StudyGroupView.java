package ru.gb.jseminar8.view;

import ru.gb.jseminar8.data.StudyGroup;

import java.util.List;
import java.util.logging.Logger;

public class StudyGroupView{

    public void sendOnConsole(List<StudyGroup> studyGroups) {
        Logger logger = Logger.getAnonymousLogger();
        System.setProperty("java.util.logging.SimpleFormatter.format",
                "%1$tF %1$tT %4$s %2$s %5$s%6$s%n");
        logger.info("\n\n\t\t\t\t\tCURRENT LIST:\n");
        studyGroups.forEach(group -> logger.info(group.toString()));
    }
}
