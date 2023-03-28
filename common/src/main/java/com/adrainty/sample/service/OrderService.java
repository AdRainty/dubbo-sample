package com.adrainty.sample.service;

import com.adrainty.sample.bean.Order;

import java.util.List;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/27 22:40
 */
public interface OrderService {

    /**
     * 初始化订单
     * @param userId 用户Id
     */
    void initOrder(String userId);

    /**
     * 获得用户关联订单信息
     * @param userId 用户Id
     */
    List<Order> getOrderByUserId(String userId);

}
