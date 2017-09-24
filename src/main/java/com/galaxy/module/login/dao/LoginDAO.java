package com.galaxy.module.login.dao;

import com.galaxy.module.global.dao.BaseDAO;
import com.galaxy.module.user.model.UserDO;

import java.util.List;

public interface LoginDAO extends BaseDAO{
    List<UserDO> findByNamePassword(String username, String password);
}
