package com.tip.travel.common.service;

import java.util.List;

import com.tip.travel.common.bo.LoginBo;
import com.tip.travel.common.bo.UserBasicInfo;

public interface UserService {
    UserBasicInfo login(LoginBo loginBo);

    Boolean cacheUserToken(UserBasicInfo userBasicInfo);

    Long checkLogin(String token);
}
