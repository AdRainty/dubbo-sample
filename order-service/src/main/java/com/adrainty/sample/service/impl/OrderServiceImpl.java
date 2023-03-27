package com.adrainty.sample.service.impl;

import com.adrainty.sample.service.OrderService;
import com.adrainty.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/27 22:41
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserService userService;

    @Override
    public void initOrder(String userId) {

    }

}
