package com.smeet.firebaseauthanddb;

import java.io.Serializable;

public class UserInfo implements Serializable {
    String userName="",userEmail="",moblieNumber="";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getMoblieNumber() {
        return moblieNumber;
    }

    public void setMoblieNumber(String moblieNumber) {
        this.moblieNumber = moblieNumber;
    }
    public UserInfo()
    {

    }
    public UserInfo(String name,String email,String mobile)
    {
        userName = name;
        userEmail = email;
        moblieNumber = mobile;
    }

}
