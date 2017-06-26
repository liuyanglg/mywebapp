package com.galaxy.project.entity;

import javax.persistence.*;

/**
 * Created by Galaxy on 2016/11/23.
 */
@Entity
@Table(name = "t_user")
public class User {
    private Integer uid;
    private String nickname;
    private String username;
    private String password;

    public User() {
    }

    public User(Integer uid, String nickname, String username, String password) {
        this.uid = uid;
        this.nickname = nickname;
        this.username = username;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uid", unique = true, nullable = false)
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Column(name = "nickname", nullable = false, length = 32)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Column(name = "username", unique = true, nullable = false, length = 32)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "password", nullable = false, length = 32)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "uid:" + uid + "," + "username:" + username + "," + "password:" + password +"," +"nickname"+nickname;
    }
}
