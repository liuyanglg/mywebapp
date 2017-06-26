package com.galaxy.project.action;

import com.galaxy.project.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Galaxy on 2017/3/18.
 */
public class LoginAction extends ActionSupport {

    @Autowired
    private UserService userService;

    private  String username;
    private String  password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() throws Exception {

        System.out.println("test: " + username + " " + password);
        Boolean loginStatus = userService.login(username, password);
        System.out.println(loginStatus);
        if (loginStatus) {
            return SUCCESS;
        } else {
            System.out.println("用户名或密码不正确");
            return INPUT;
        }
    }

}
