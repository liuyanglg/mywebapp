package com.galaxy.project.service;

import com.galaxy.project.entity.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Galaxy on 2017/3/14.
 */

public class UserServiceTest extends BaseTest {
    public static Logger logger = Logger.getLogger(UserServiceTest.class);
    @Autowired
    private UserService userService;


    @Test
    @Transactional
    @Rollback(false)
    public void findByNamePasswordTest() throws Exception {
        boolean loginStatus = userService.login("liuyang", "j00jpg809");
        System.out.println(loginStatus);
    }

    @Test
    @Transactional
    @Rollback(false)
    public void findAllUserTest() throws Exception {
        List<User> userList;
        userList = userService.findAllUser(User.class);
        for (User u : userList)
            System.out.println(u);
    }

}