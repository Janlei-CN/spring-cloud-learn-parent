package com.janlei.service.impl;

import com.janlei.dao.ProductDao;
import com.janlei.entity.Product;
import com.janlei.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 商品服务实现
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    @Qualifier("productDao")
    private ProductDao productDao;

    @Override
    public Product findById(Long id) {
        return productDao.findById(id).get();
    }

    @Override
    public void save(Product product) {
        productDao.save(product);
    }

    @Override
    public void update(Product product) {
        productDao.save(product);
    }

    @Override
    public void delete(Long id) {
        productDao.deleteById(id);
    }
}
