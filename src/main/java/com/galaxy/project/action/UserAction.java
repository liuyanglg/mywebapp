package com.galaxy.project.action;

import com.galaxy.project.entity.User;
import com.galaxy.project.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import javax.annotation.Resource;

/**
 * Created by Galaxy on 2016/11/23.
 */
//@ParentPackage("struts-default")
//@Results({@Result(name = "success",location = "/jsp/success.jsp"),
//        @Result(name = "fail",location = "/jsp/fail.jsp")})
public class UserAction extends ActionSupport implements ModelDriven<User> {
    User user = new User();

    @Override
    public User getModel() {
        return user;
    }

    @Resource
    UserService userService;

    public String addUserAction() {
        System.out.println(user);
        User userTemp = userService.register(user.getUsername());
        if (userTemp != null) {
            System.out.println("用户已经存在！");
            return "register";
        } else {
            System.out.println(user);
            userService.addUser(user);
            System.out.println("添加成功！");
            return SUCCESS;
        }
    }

}

//}
//    public String addUserAction() {
//        try {
//            System.out.println("user:" + user.toString());
//            Calendar ca = Calendar.getInstance();
//            int year = ca.get(Calendar.YEAR);//获取年份
//            int month = ca.get(Calendar.MONTH) + 1;//获取月份
//            int day = ca.get(Calendar.DATE);//获取日
//            int minute = ca.get(Calendar.MINUTE);//分
//            int hour = ca.get(Calendar.HOUR_OF_DAY);//小时
//            int second = ca.get(Calendar.SECOND);//秒
////            Integer time = "" + year + timeToString(month) + timeToString(day) + timeToString(hour) + timeToString(minute) + timeToString(second);
////            if (user.getUid() == null || user.getUid().equals("")) {
////                user.setUid(time);
////            }
//            if (user.getUsername() == null || user.getUsername().equals("")) {
//                user.setUsername("Null");
//            }
//            if (user.getPassword() == null || user.getPassword().equals("")) {
//                user.setPassword("Null");
//            }
//
//            System.out.println("user:" + user.toString());
//            userService.addUser(user);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "fail";
//        }
//        return "success";
//    }
//
//    public String timeToString(int time) {
//        int temp = time;
//        temp /= 10;
//        if (temp == 0) {
//            return "0" + time;
//        } else {
//            return "" + time;
//        }
//    }
//
//    public void isUserEmpty(User user) {
//        Date date = new Date();
//        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
////        Integer time = format.format(date);
////        if (user.getUid() == null || user.getUid() == "") {
////            user.setUid(time);
////        }
//        if (user.getUsername() == null || user.getUsername() == "") {
//            user.setUsername("Null");
//        }
//        if (user.getPassword() == null || user.getPassword() == "") {
//            user.setPassword("Null");
//        }
//    }

