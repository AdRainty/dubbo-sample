package com.adrainty.sample.dao;

import com.adrainty.sample.bean.User;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/28 23:02
 */
public interface UserDao {

    /**
     * 根据用户Id查询用户信息
     * @param userId 用户id
     * @return 用户信息
     */
    User getUserInfo(String userId);

    /**
     * 添加用户
     * @param user 用户实体类
     */
    void add(User user);
}
