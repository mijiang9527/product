package com.mijiang.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.mijiang.pojo.ProductPo;
@Mapper
public interface ProductDao {
    public ProductPo getProduct(Long id);
    public int decreaseProduct(@Param("id") Long id,@Param("quantity") int quantity);
}
