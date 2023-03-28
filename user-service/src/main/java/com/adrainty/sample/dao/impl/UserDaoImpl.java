package com.adrainty.sample.dao.impl;

import com.adrainty.sample.bean.User;
import com.adrainty.sample.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/28 23:02
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    @Qualifier("mongoTemplate")
    protected MongoTemplate mongoTemplate;

    @Override
    public User getUserInfo(String userId) {
        return null;
    }

    @Override
    public void add(User user) {

    }
}
