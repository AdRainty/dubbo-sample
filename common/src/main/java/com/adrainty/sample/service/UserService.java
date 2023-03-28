package com.adrainty.sample.service;

import com.adrainty.sample.bean.User;

import java.util.List;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/27 22:35
 */
public interface UserService {

    User getUserInfo(String userId);

    void add(User user);
}
