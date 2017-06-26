package com.galaxy.project.service;

import com.galaxy.project.dao.UserDao;
import com.galaxy.project.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Galaxy on 2017/3/18.
 */
public class UserDaoTest extends BaseTest {
    @Autowired
    private UserDao userDao;
    private User user;

    @Test
    @Transactional
    @Rollback(false)
    public void saveTest() throws Exception {

        for (int i = 0; i < 15; i++) {
            User user = new User();
            user.setUsername("test" + i);
            user.setNickname("管理员" + i);
            user.setPassword("123456");
            userDao.save(user);
        }
    }


    @Test
    @Transactional
    @Rollback(false)
    public void deleteTest() throws Exception {
        User user = userDao.get(User.class, 6);
        System.out.println(user);
        if (user != null) {
            userDao.delete(user);
        } else {
            System.out.println("user not exists!");
        }
    }


    @Test
    @Transactional
    @Rollback(false)
    public void findTest() throws Exception {
        String hql = "from User user where user.name=? and user.password=?";
        List<User> userList = (List<User>) userDao.find(hql, "li", "123456");
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    @Transactional
    @Rollback(false)
    public void findByNameTest() throws Exception {
        User user = userDao.findByName("liuyang");
        System.out.println(user);
    }
}
