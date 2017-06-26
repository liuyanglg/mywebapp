package com.galaxy.project.action;

import com.galaxy.project.entity.User;
import com.galaxy.project.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Galaxy on 2017/3/21.
 */
public class GetAllUserAction extends ActionSupport {
    Map<String,Object> dataMap;
    
    @Autowired
    UserService userService;

    @Override
    public String execute() throws Exception {
        dataMap = new HashMap<String, Object>();
        List<User> userList = userService.findAllUser(User.class);
        for(User u:userList){
            System.out.println(u);
            dataMap.put(""+u.getUid(), u);
        }
        return SUCCESS;
    }

        public Map<String, Object> getDataMap() {
        return dataMap;
    }

    public void setDataMap(Map<String, Object> dataMap) {
        this.dataMap = dataMap;
    }
}
