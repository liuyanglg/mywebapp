package com.galaxy.module.user.model;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "ssh_project")
public class UserDO {
    private int id;
    private String uid;
    private String username;
    private String password;
    private String nickname;
    private Integer userType;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "uid", nullable = true, length = 32)
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "username", nullable = true, length = 30)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 30)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "nickname", nullable = true, length = 30)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "usertype", nullable = true)
    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer usertype) {
        this.userType = usertype;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        UserDO tbUserDO = (UserDO) o;
//
//        if (id != tbUserDO.id) return false;
//        if (uid != null ? !uid.equals(tbUserDO.uid) : tbUserDO.uid != null) return false;
//        if (username != null ? !username.equals(tbUserDO.username) : tbUserDO.username != null) return false;
//        if (password != null ? !password.equals(tbUserDO.password) : tbUserDO.password != null) return false;
//        if (nickname != null ? !nickname.equals(tbUserDO.nickname) : tbUserDO.nickname != null) return false;
//        if (userType != null ? !userType.equals(tbUserDO.userType) : tbUserDO.userType != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id;
//        result = 31 * result + (uid != null ? uid.hashCode() : 0);
//        result = 31 * result + (username != null ? username.hashCode() : 0);
//        result = 31 * result + (password != null ? password.hashCode() : 0);
//        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
//        result = 31 * result + (userType != null ? userType.hashCode() : 0);
//        return result;
//    }

    @Override
    public String toString() {
        return "UserDO{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", userType=" + userType +
                '}';
    }
}
