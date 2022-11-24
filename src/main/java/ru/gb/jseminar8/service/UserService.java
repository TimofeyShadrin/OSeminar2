package ru.gb.jseminar8.service;

import ru.gb.jseminar8.data.Student;
import ru.gb.jseminar8.data.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements UserDataService {

    private final List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    @Override
    public void createUser(String firstName, String lastName, String patronymic) {
        this.users.add(new Student(firstName, lastName, patronymic));
    }

    @Override
    public List<User> getAll() {
        return this.users;
    }

    @Override
    public void deleteUser(Long id) {
        for (User item : this.users) {
            if (item instanceof Student) {
                if (id.equals(((Student) item).getStudentID())) {
                    this.users.remove(item);
                }
            }
        }
    }
}
