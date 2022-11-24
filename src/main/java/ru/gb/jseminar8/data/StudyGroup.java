package ru.gb.jseminar8.data;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> studentList;
    private static final AtomicLong studyGroupID = new AtomicLong(0);
    private final Long id;

    public StudyGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
        this.id = studyGroupID.incrementAndGet();
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Long getStudyGroupID() {
        return this.id;
    }

    @Override
    public String toString() {
        return "StudyGroup{" + this.id + "\n" +
                "teacher=" + teacher +
                "\nstudentList=" + studentList +
                '}';
    }
}
