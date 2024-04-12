package ru.ishkulov.MyFirstApp2SpringBoot.service;

import ru.ishkulov.MyFirstApp2SpringBoot.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getAllUsers();

    User getUserById(long id);

    void updateUserById(long id, User updatedUser);

    void removeUserById(long id);
}
