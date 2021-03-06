package com.hopshop.feignClient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by rohith on 23/11/17.
 */
@FeignClient("mse-customer")
public interface MseCustomerClient {

    @GetMapping("/v1/customers/")
    List getCustomerDetailsList();

}
