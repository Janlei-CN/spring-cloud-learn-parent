package com.janlei.service;

import com.janlei.entity.Order;

/**
 * 订单Service接口
 */
public interface OrderService {
    /**
     * 查询
     */
    Order findById(Long id);
    /**
     * 保存
     */
    void save(Order order);
    /**
     * 更新
     */
    void update(Order order);
    /**
     * 删除
     */
    void delete(Long id);
}
