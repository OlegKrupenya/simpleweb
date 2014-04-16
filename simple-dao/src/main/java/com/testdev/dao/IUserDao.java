package com.testdev.dao;

import java.util.List;

import com.testdev.domain.User;

public interface IUserDao {
    User getUserByEmail(String userEmail);
    List<User> getAllUsers();
    User addUser(User user);
    User updateUser(User user);
    User deleteUser(User user);
}
