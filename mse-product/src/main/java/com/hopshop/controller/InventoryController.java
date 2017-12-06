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
@RequestMapping("/v1/inventories")
public class InventoryController {

    @GetMapping(value = "")
    public List getInventoryList(){
        List responseBody = new ArrayList();
        return responseBody;
    }

    @PostMapping(value = "")
    public Map addInventory(){
        Map responseBody = new HashMap();
        return responseBody;

    }

    @PutMapping(value = "/{inventoryId}")
    public Map updateInventory(@PathVariable("inventoryId") Long inventoryId){
        Map responseBody = new HashMap();
        return responseBody;
    }

    @DeleteMapping(value = "")
    public Map deleteInventory(){
        Map responseBody = new HashMap();
        return responseBody;
    }

}
