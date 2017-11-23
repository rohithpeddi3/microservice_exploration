package com.zemoso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@EnableZuulProxy
public class MseGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MseGatewayApplication.class, args);
	}
}
