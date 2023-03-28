package com.adrainty.sample.service.impl;

import com.adrainty.sample.bean.User;
import com.adrainty.sample.dao.UserDao;
import com.adrainty.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/27 22:36
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserInfo(String userId) {
        return userDao.getUserInfo(userId);
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

}
