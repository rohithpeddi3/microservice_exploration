package com.hopshop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rohith on 22/11/17.
 */
@RestController
@Slf4j
@RequestMapping("/v1/brands")
public class BrandController {

    @GetMapping(value = "")
    public List getBrandList(){
        List responseBody = new ArrayList();
        return responseBody;
    }

    @PostMapping(value = "")
    public Map addBrand(){
        Map responseBody = new HashMap();
        return responseBody;
    }

    @PutMapping(value = "/{brandId}")
    public Map updateBrand(@PathVariable("brandId") Long brandId){
        Map responseBody = new HashMap();
        return responseBody;
    }

    @DeleteMapping(value = "")
    public Map deleteBrand(){
        Map responseBody = new HashMap();
        return responseBody;
    }

}
