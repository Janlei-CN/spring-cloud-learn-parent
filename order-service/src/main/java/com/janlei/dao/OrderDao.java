package com.janlei.dao;

import com.janlei.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderDao extends JpaRepository<Order,Long>, JpaSpecificationExecutor<Order> {
}
