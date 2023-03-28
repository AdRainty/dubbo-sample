package com.adrainty.sample.controller;

import com.adrainty.sample.bean.Order;
import com.adrainty.sample.bean.OrderBo;
import com.adrainty.sample.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/28 22:22
 */

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/")
    public List<Order> getOrderByUser(String userId){
        return orderService.getOrderByUserId(userId);
    }

}
