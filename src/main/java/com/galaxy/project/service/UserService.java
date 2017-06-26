package com.galaxy.project.service;

import com.galaxy.project.entity.User;

import java.util.List;

/**
 * Created by Galaxy on 2016/11/23.
 */
public interface UserService {
    public void addUser(User user);

    public void deleteUser(User user);

    public List<User> findAllUser(Class<User> userClass);

    public boolean login(String username, String password);

    public User register(String username);

}
