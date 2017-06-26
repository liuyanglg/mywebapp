package com.galaxy.project.dao.impl;

import com.galaxy.project.dao.UserDao;
import com.galaxy.project.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Galaxy on 2017/3/13.
 */
@Repository(value = "userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

    @Override
    public List<User> findByNamePassword(String username, String password) {
        String hql = "from User user where user.username=? and user.password=?";
        List<User> userList = (List<User>) super.find(hql, username, password);
        return userList;
    }

    @Override
    public User findByName(String username) {
        String hql = "from User user where user.username=? ";
        List<User> userList = super.find(hql, username);
        if(userList.isEmpty()){
            return null;
        }
        return userList.get(0);
    }

}
