package com.adrainty.sample.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/27 22:31
 */
@Data
@AllArgsConstructor
public class UserAddress {

    private Integer id;

    private String address;

    private String userId;

    private String consignee;

    private String phoneNum;

    private String isDefault;

}
