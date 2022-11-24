package ru.gb.jseminar8.service;

import ru.gb.jseminar8.data.User;

import java.util.List;

public interface UserDataService {
    void createUser(String firstName, String lastName, String patronymic);

    List<User> getAll();

    void deleteUser(Long id);
}
