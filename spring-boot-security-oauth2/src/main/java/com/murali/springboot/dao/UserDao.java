package com.murali.springboot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.murali.springboot.model.User;

/**
 * @author:Sanapala MuraliDharan
 * @date:Nov 18, 2019 8:14:33 PM
 * @version:2.0
 */
@Repository
public interface UserDao extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
