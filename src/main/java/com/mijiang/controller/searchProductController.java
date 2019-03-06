package com.mijiang.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mijiang.pojo.ProductPo;
import com.mijiang.service.searchProductService;

@Controller
@RequestMapping("/search")
public class searchProductController {
    private searchProductService search = null;
    
    @RequestMapping("/searchProduct")
    
    public ModelAndView search() {
    	@SuppressWarnings("unchecked")
		List<ProductPo> productpoList = (List<ProductPo>) search.searchProduct(1L);
    	ModelAndView mv = new ModelAndView();
    	mv.setViewName("search/searchProduct");
    	mv.addObject("productpoList",productpoList);
    	return mv;
    }
    
    @RequestMapping("/list")
    @ResponseBody
    public List<ProductPo> list(@RequestParam(value="id",required=false) long id){
    	@SuppressWarnings("unchecked")
		List<ProductPo> productpoList = (List<ProductPo>) search.searchProduct(id);
    	return productpoList;
    }
    
}
