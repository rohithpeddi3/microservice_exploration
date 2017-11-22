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
@RequestMapping("/mseproduct/v1/categories/")
public class categoryController {
    @GetMapping(value = "")
    public List getCategoryList(){
        List responseBody = new ArrayList();
        return responseBody;
    }

    @PostMapping(value = "")
    public Map addCategory(){
        Map responseBody = new HashMap();
        return responseBody;

    }

    @PutMapping(value = "")
    public Map updateCategory(){
        Map responseBody = new HashMap();
        return responseBody;
    }

    @DeleteMapping(value = "")
    public Map deleteCategory(){
        Map responseBody = new HashMap();
        return responseBody;
    }
}
