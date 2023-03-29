package com.adrainty.sample.dao;

import com.adrainty.sample.bean.Order;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/28 22:51
 */
public interface OrderDao {
    /**
     * 根据订单Id获取订单信息
     * @param orderId 订单id
     * @return 订单信息
     */
    Order getOrderInfo(String orderId);

    /**
     * 添加订单
     * @param order 订单实体类
     */
    void add(Order order);
}
