package com.galaxy.module.login.service;

import com.galaxy.module.user.model.UserDO;

public interface LoginService {
    UserDO findByNamePassword(String username, String password);
}
