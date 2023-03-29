package com.adrainty.sample.service.impl;

import com.adrainty.sample.bean.Order;
import com.adrainty.sample.bean.User;
import com.adrainty.sample.dao.OrderDao;
import com.adrainty.sample.service.OrderService;
import com.adrainty.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/27 22:41
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserService userService;

    @Autowired
    private OrderDao orderDao;

    @Override
    public Order getOrderByUserId(String userId) {
        User userInfo = userService.getUserInfo(userId);
        String orderId = userInfo.getOrderId();
        return orderDao.getOrderInfo(orderId);
    }

    @Override
    public void add(Order order) {
        orderDao.add(order);
    }
}
