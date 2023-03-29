package com.adrainty.sample.controller;

import com.adrainty.sample.bean.Order;
import com.adrainty.sample.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/28 22:22
 */

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/info")
    public Order getOrderByUser(@RequestParam String orderId){
        return orderService.getOrderByUserId(orderId);
    }

    @PostMapping("/add")
    public void add(@RequestBody Order order){
        orderService.add(order);
    }

}
