package com.adrainty.sample.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/27 22:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;

    private String userId;

    private String username;

    private String phoneNum;


}
