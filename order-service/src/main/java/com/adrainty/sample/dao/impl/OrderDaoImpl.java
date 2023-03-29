package com.adrainty.sample.dao.impl;

import com.adrainty.sample.bean.Order;
import com.adrainty.sample.bean.User;
import com.adrainty.sample.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/28 22:51
 */
@Repository
public class OrderDaoImpl implements OrderDao {

    @Autowired
    @Qualifier("mongoTemplate")
    protected MongoTemplate mongoTemplate;

    @Override
    public Order getOrderInfo(String orderId) {
        Order order = null;
        try {
            Criteria criteria = new Criteria();
            criteria.and("orderId").is(order);
            Query query = new Query(criteria);
            order = mongoTemplate.findOne(query, Order.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return order;
    }

    @Override
    public void add(Order order) {
        this.mongoTemplate.insert(order);
    }
}
