package com.galaxy.module.user.service.impl;

import com.galaxy.module.user.dao.UserDAO;
import com.galaxy.module.user.model.UserDO;
import com.galaxy.module.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    public UserDO get(int id) {
        return (UserDO) userDAO.get(UserDO.class,id);
    }

    public UserDO load(int id) {
        return (UserDO) userDAO.load(UserDO.class,id);
    }
    public UserDO load(UserDO userDO){
        return (UserDO) userDAO.load(UserDO.class,userDO.getId());
    }
    public void save(UserDO userDO) {
        userDAO.save(userDO);
    }

    public void remove(UserDO userDO) {
        userDAO.remove(userDO);
    }

    public void update(UserDO userDO) {
        userDAO.update(userDO);
    }

    public List<UserDO> listAll() {
        return userDAO.loadAll(UserDO.class);
    }
}
