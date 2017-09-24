package com.galaxy.module.login.service.impl;

import com.galaxy.module.login.dao.LoginDAO;
import com.galaxy.module.login.service.LoginService;
import com.galaxy.module.user.model.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDAO loginDAO;

    public UserDO findByNamePassword(String username, String password) {
        List<UserDO> userDOList = loginDAO.findByNamePassword(username, password);
        if (userDOList != null && userDOList.size() > 0) {
            return userDOList.get(0);
        }
        return null;
    }
}
