package com.galaxy.module.login.dao.impl;

import com.galaxy.module.global.dao.impl.BaseDAOImpl;
import com.galaxy.module.login.dao.LoginDAO;
import com.galaxy.module.user.dao.UserDAO;
import com.galaxy.module.user.model.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("loginDAO")
public class LoginDAOImpl  extends BaseDAOImpl implements LoginDAO{
    @Autowired
    private UserDAO userDAO;
    public List<UserDO> findByNamePassword(String username, String password) {
        String hql = "FROM UserDO user where user.username=? and user.password=?";
        return userDAO.find(hql,username,password);
    }
}
