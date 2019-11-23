package com.murali.springboot.service;

import java.util.List;

import com.murali.springboot.model.User;

/**
 * @author:Sanapala MuraliDharan
 * @date:Nov 18, 2019 8:17:45 PM
 * @version:2.0
 */
public interface UserService {

    User save(User user);

    List<User> findAll();

    void delete(long id);
}
