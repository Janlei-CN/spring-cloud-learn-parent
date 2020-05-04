package com.janlei.controller;

import com.janlei.entity.Product;
import com.janlei.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品控制器
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public String find(){
        return "hello";
    }
    /**
     * 查询
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product findById(@PathVariable("id") Long id){
        return productService.findById(id);
    }
    /**
     * 保存
     */
    @RequestMapping(method = RequestMethod.POST)
    public void save(Product product){
        System.out.println("save");
        //productService.save(product);
    }
    /**
     * 更新
     */
    @RequestMapping(method = RequestMethod.PUT)
    public void update(Product product){
        productService.update(product);
    }
    /**
     * 删除
     */
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id){
        productService.delete(id);
    }
}
