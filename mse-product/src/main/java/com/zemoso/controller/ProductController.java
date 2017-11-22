package com.zemoso.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by varun on 22/11/17.
 */
@RestController
@Slf4j
@RequestMapping("/mseproduct/v1/products/")
public class ProductController {

    @GetMapping(value = "")
    public List getProductList(){
        List responseBody = new ArrayList();
        return responseBody;
    }

    @PostMapping(value = "")
    public Map addProduct(){
        Map responseBody = new HashMap();
        return responseBody;

    }

    @PutMapping(value = "")
    public Map updateProduct(){
        Map responseBody = new HashMap();
        return responseBody;
    }

    @DeleteMapping(value = "")
    public Map deleteProduct(){
        Map responseBody = new HashMap();
        return responseBody;
    }

}
