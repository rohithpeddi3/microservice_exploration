package com.hopshop.controller;

import com.hopshop.service.CartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/v1/carts")
public class CartController {

    @Autowired
    CartService cartService;

    @GetMapping(value = "")
    public List getCartList(){
        List responseBody = new ArrayList();
        return responseBody;
    }

    @GetMapping(value = "/{cartId}")
    public List getCartDetails(@PathVariable("cartId") Long cartId) {
        return cartService.getCartProductDetails(cartId);
    }

    @PostMapping(value = "")
    public Map addCartDetails(){
        Map responseBody = new HashMap();
        return responseBody;
    }

    @PutMapping(value = "/{cartId}")
    public Map updateCart(){
        Map responseBody = new HashMap();
        return responseBody;
    }

    @DeleteMapping(value = "")
    public Map deleteCart(){
        Map responseBody = new HashMap();
        return responseBody;
    }

}
