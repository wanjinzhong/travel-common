package com.tip.travel.common.bo;

import com.tip.travel.common.enums.LoginType;

import java.io.Serializable;

public class LoginBo implements Serializable {

    private static final long serialVersionUID = 5435776460569495079L;
    private LoginType loginType;
    private String wxOpenId;
    private String phone;
    private String dynamicCode;
    private String password;

    public LoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginType loginType) {
        this.loginType = loginType;
    }

    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDynamicCode() {
        return dynamicCode;
    }

    public void setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
