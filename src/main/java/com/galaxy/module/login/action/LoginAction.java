package com.galaxy.module.login.action;

import com.galaxy.module.login.service.LoginService;
import com.galaxy.module.user.model.UserDO;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

public class LoginAction {

    @Autowired
    private LoginService loginService;

    private UserDO user;

    public UserDO getUser() {
        return user;
    }

    public void setUser(UserDO user) {
        this.user = user;
    }

    public String loginAction() {
        UserDO userDO = loginService.findByNamePassword(user.getUsername(), user.getPassword());
        if (userDO != null) {
            return "success";
        }
//        MessageUtil.sendMessage("用户名或密码错误");
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("message", "用户名或密码错误");
        return "login";
    }
}
