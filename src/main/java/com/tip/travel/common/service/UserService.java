package com.tip.travel.common.service;

import com.tip.travel.common.bo.LoginBo;
import com.tip.travel.common.bo.LoginResBo;

public interface UserService {
    LoginResBo login(LoginBo loginBo);
}
