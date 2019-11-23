package com.murali.springboot.service;

import java.util.List;

import com.murali.springboot.model.User;

/**
 * @author:Sanapala MuraliDharan
 * @date:Nov 23, 2019 8:40:50 PM 
 * @version:2.0
 */
public interface UserService {
    public void createUser(User user);
    public List<User> getUser();
    public User findById(int id);
    public void update(User user);
    public void deleteUserById(int id);
    public void updatePartially(User user, int id);
}
