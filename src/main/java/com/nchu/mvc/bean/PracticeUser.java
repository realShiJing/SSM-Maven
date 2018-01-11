package com.nchu.mvc.bean;

/**
 * Created by yangshijing on 2018/1/11 0011.
 */
public class PracticeUser {

    private   Integer id;
    private  String userName;
    private String password;
    private String phone;
    private String faceCode;

    public PracticeUser() {
    }

    public PracticeUser(String faceCode, Integer id, String password, String phone, String userName) {
        this.faceCode = faceCode;
        this.id = id;
        this.password = password;
        this.phone = phone;
        this.userName = userName;
    }

    public String getFaceCode() {
        return faceCode;
    }

    public void setFaceCode(String faceCode) {
        this.faceCode = faceCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "PracticeUser{" +
                "faceCode='" + faceCode + '\'' +
                ", id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
