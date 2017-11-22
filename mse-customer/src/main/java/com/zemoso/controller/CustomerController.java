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
@RequestMapping("/msecustomer/v1/customers/")
public class CustomerController {

    @GetMapping(value = "")
    public List getCustomerDetailsList(){
        List responseBody = new ArrayList();
        return responseBody;
    }

    @PostMapping(value = "")
    public Map addCustomer(){
        Map responseBody = new HashMap();
        return responseBody;

    }

    @PutMapping(value = "")
    public Map updateCustomer(){
        Map responseBody = new HashMap();
        return responseBody;
    }

    @DeleteMapping(value = "")
    public Map deleteCustomer(){
        Map responseBody = new HashMap();
        return responseBody;
    }
}
