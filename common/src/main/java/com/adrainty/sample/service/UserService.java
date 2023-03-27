package com.adrainty.sample.service;

import com.adrainty.sample.bean.UserAddress;

import java.util.List;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/27 22:35
 */
public interface UserService {

    /**
     * 按照用户id返回所有的收货地址
     * @param userId 用户id
     * @return 收货地址
     */
    public List<UserAddress> getUserAddressList(String userId);

}
