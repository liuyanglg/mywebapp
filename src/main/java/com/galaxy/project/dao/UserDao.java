package com.galaxy.project.dao;

import com.galaxy.project.entity.User;

import java.util.List;

/**
 * Created by Galaxy on 2016/11/23.
 */
public interface UserDao extends BaseDao<User>{
    public List<User> findByNamePassword(String username, String password);

    public User findByName(String username);
}
