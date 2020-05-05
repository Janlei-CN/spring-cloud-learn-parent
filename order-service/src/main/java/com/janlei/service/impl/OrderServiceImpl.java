package com.janlei.service.impl;

import com.janlei.dao.OrderDao;
import com.janlei.entity.Order;
import com.janlei.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    
    @Autowired
    @Qualifier("orderDao")
    private OrderDao OrderDao;

    @Override
    public Order findById(Long id) {
        return OrderDao.findById(id).get();
    }

    @Override
    public void save(Order Order) {
        OrderDao.save(Order);
    }

    @Override
    public void update(Order Order) {
        OrderDao.save(Order);
    }

    @Override
    public void delete(Long id) {
        OrderDao.deleteById(id);
    }
}
