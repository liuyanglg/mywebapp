package com.galaxy.module.user.service;

import com.galaxy.module.user.model.UserDO;

import java.util.List;

public interface UserService {
    UserDO get(int id);

    UserDO load(int id);

    UserDO load(UserDO userDO);

    void remove(UserDO userDO);

    void update(UserDO userDO);

    void save(UserDO userDO);

    List<UserDO> listAll();
}
