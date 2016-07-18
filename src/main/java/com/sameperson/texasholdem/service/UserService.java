package com.sameperson.texasholdem.service;

import com.sameperson.texasholdem.model.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
    void save(User user, MultipartFile multipartFile);
    void delete(User user);
}
