package com.mijiang.service.impl; 

import java.util.List;

import com.mijiang.dao.ProductDao;
import com.mijiang.pojo.ProductPo;
import com.mijiang.service.searchProductService;

public class searchProductServiceImpl implements searchProductService{
	private ProductDao productdao = null ;
	public ProductPo searchProduct(long id) {
		// TODO Auto-generated method stub
		List<ProductPo> productPoList = (List<ProductPo>) productdao.getProduct(id);
		return (ProductPo) productPoList;
	}

}
;