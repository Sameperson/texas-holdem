package com.sameperson.texasholdem.dao;

import com.sameperson.texasholdem.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    User findById(Long id);
    void save(User user);
    void delete(User user);
}
