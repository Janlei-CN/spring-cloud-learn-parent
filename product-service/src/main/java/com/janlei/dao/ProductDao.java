package com.janlei.dao;

import com.janlei.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 商品查询接口
 */
public interface ProductDao extends JpaRepository<Product,Long>, JpaSpecificationExecutor<Product> {
}
