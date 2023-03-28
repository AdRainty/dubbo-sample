package com.adrainty.sample.bean;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/28 22:26
 */
@Data
public class Order {

    private String orderId;

    private String orderName;

    private BigDecimal count;

    private String userId;

}
