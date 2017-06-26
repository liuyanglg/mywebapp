package com.galaxy.project.service.impl;

import com.galaxy.project.dao.UserDao;
import com.galaxy.project.entity.User;
import com.galaxy.project.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Galaxy on 2016/11/23.
 */
@Transactional
@Service(value = "userService")
public class UserServiceImpl implements UserService{

    @Resource
    UserDao userDao;

    public void addUser(User user) {
        userDao.save(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.delete(user);
    }

    @Override
    public List<User> findAllUser(Class<User> userClass) {
        return userDao.loadAll(userClass);
    }

    @Override
    public boolean login(String username, String password) {
        List<User> userList = userDao.findByNamePassword(username, password);
        if (userList.size()<=0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public User register(String username) {
        return userDao.findByName(username);
    }
}
