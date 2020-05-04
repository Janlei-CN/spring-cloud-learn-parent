package com.janlei.service;

import com.janlei.entity.Product;

/**
 * 商品Service接口
 */
public interface ProductService {
    /**
     * 查询
     */
    Product findById(Long id);
    /**
     * 保存
     */
    void save(Product product);
    /**
     * 更新
     */
    void update(Product product);
    /**
     * 删除
     */
    void delete(Long id);
}
