package com.adrainty.sample.service;

import com.adrainty.sample.bean.Order;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/27 22:40
 */
public interface OrderService {

    /**
     * 获得用户关联订单信息
     * @param userId 用户Id
     */
    Order getOrderByUserId(@RequestParam String userId);

    /**
     * 添加订单
     * @param order 订单实体类
     */
    void add(Order order);
}
