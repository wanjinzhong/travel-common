package com.tip.travel.common.bo;

import java.io.Serializable;

public class UserBasicInfo implements Serializable {
    private static final long serialVersionUID = 2832695407322162245L;
    private Long userId;
    private String userName;
    private String token;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
