package com.sameperson.texasholdem.service;

import com.sameperson.texasholdem.dao.UserDao;
import com.sameperson.texasholdem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(Long id) {
        return userDao.findById(id);
    }

    @Override
    public void save(User user, MultipartFile file) {
        try {
            user.setUserpic(file.getBytes());
        } catch (IOException e) {
            System.err.println("Unable to get data from file");
        }
        userDao.save(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }
}
