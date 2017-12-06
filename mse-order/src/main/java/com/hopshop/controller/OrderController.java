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
@RequestMapping("/v1/orders")
public class OrderController {

    @GetMapping(value = "")
    public List getOrderList(){
        List responseBody = new ArrayList();
        return responseBody;
    }

    @PostMapping(value = "")
    public Map addOrder(){
        Map responseBody = new HashMap();
        return responseBody;

    }

    @PutMapping(value = "/{orderId}")
    public Map updateOrder(@PathVariable("orderId") Long orderId){
        Map responseBody = new HashMap();
        return responseBody;
    }

    @DeleteMapping(value = "")
    public Map deleteOrder(){
        Map responseBody = new HashMap();
        return responseBody;
    }

}
