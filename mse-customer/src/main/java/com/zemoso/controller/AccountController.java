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
@RequestMapping("/msecustomer/v1/accounts/")
public class AccountController {

    @GetMapping(value = "")
    public List getAccountDetailsList(){
        List responseBody = new ArrayList();
        return responseBody;
    }

    @PostMapping(value = "")
    public Map addAccountDetails(){
        Map responseBody = new HashMap();
        return responseBody;

    }

    @PutMapping(value = "")
    public Map updateAccountDetails(){
        Map responseBody = new HashMap();
        return responseBody;
    }

    @DeleteMapping(value = "")
    public Map deleteAccount(){
        Map responseBody = new HashMap();
        return responseBody;
    }
}

