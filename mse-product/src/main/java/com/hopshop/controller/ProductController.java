package com.hopshop.controller;

import com.hopshop.feignClient.MseCustomerClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rohith on 22/11/17.
 */
@RestController
@Slf4j
@RequestMapping("/v1/products")
public class ProductController {

    @Autowired
    MseCustomerClient mseCustomerClient;


    @GetMapping(value = "")
    public List getProductList(){
        return mseCustomerClient.getCustomerDetailsList();
    }

    @PostMapping(value = "")
    public Map addProduct(){
        Map responseBody = new HashMap();
        return responseBody;

    }

    @PutMapping(value = "/{productId}")
    public Map updateProduct(@PathVariable("productId") Long productId){
        Map responseBody = new HashMap();
        return responseBody;
    }

    @DeleteMapping(value = "")
    public Map deleteProduct(){
        Map responseBody = new HashMap();
        return responseBody;
    }

}
