package com.adrainty.sample.service.impl;

import com.adrainty.sample.bean.Order;
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
    private OrderService orderService;

    @Override
    public void initOrder(String userId) {

    }

    @Override
    public List<Order> getOrderByUserId(String userId) {
        return null;
    }
}
