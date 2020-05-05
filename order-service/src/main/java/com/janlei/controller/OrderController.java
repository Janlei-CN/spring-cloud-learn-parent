package com.janlei.controller;

import com.janlei.entity.Order;
import com.janlei.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单控制器
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 查询
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Order findById(@PathVariable("id") Long id){
        return orderService.findById(id);
    }
    /**
     * 保存
     */
    @RequestMapping(method = RequestMethod.POST)
    public void save(Order order){
        System.out.println("save");
        //orderService.save(product);
    }
    /**
     * 更新
     */
    @RequestMapping(method = RequestMethod.PUT)
    public void update(Order order){
        orderService.update(order);
    }
    /**
     * 删除
     */
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id){
        orderService.delete(id);
    }

}
