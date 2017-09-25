package com.galaxy.module.user.service.impl;

import com.galaxy.module.BaseTest;
import com.galaxy.module.user.model.UserDO;
import com.galaxy.module.user.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class UserServiceImplTest extends BaseTest {
    @Autowired
    private UserService userService;

    @Test
    public void get() throws Exception {
        UserDO userDO = userService.get(2);
        System.out.println(userDO);
    }

    @Test
    public void load() throws Exception {
        UserDO userDO = userService.load(new Integer(2));
        System.out.println(userDO);
    }

    @Test
    public void save() throws Exception {
        UUID uuid = UUID.randomUUID();
        UserDO userDO = new UserDO();
        userDO.setUid(uuid.toString());
        userDO.setUsername("liuyang");
        userDO.setPassword("user");
        userDO.setNickname("刘阳");
        userDO.setUserType(1);
        userService.save(userDO);
    }

    @Test
    public void remove() throws Exception {
        UserDO userDO = userService.get(1);
        System.out.println(userDO);
        UserDO userDO1 = new UserDO();
        userDO1.setId(userDO.getId());
        userDO1.setUsername(userDO.getUsername());
        userService.remove(userDO1);
    }

    @Test
    public void update() throws Exception {
        UserDO userDO = userService.get(4);
        System.out.println(userDO);
        userDO.setUsername("liu");
        userService.update(userDO);
    }

    @Test
    public void listAll() throws Exception {
        List<UserDO> userDOList = userService.listAll();
        for(UserDO userDO:userDOList){
            System.out.println(userDO);
        }
    }

}