package com.jongrakko.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by MoonJR on 2016. 9. 24..
 */

public class Post {

    private String userId;
    private String userPasswd;
    private Date regDate;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
}
