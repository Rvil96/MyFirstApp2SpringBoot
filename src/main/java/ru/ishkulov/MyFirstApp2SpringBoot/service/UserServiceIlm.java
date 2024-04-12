package ru.ishkulov.MyFirstApp2SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ishkulov.MyFirstApp2SpringBoot.model.User;
import ru.ishkulov.MyFirstApp2SpringBoot.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceIlm implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceIlm(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(long id) {
        return userRepository.findById(id).orElse(new User());
    }

    @Override
    @Transactional
    public void updateUserById(long id, User updatedUser) {
        updatedUser.setId(id);
        userRepository.save(updatedUser);
    }

    @Override
    @Transactional
    public void removeUserById(long id) {
        userRepository.deleteById(id);
    }
}
