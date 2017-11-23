package com.zemoso.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rohith on 23/11/17.
 */
@RestController
public class MainController {

    @GetMapping("/msegateway")
    public String test() {
        return "Hello@@";
    }


}
