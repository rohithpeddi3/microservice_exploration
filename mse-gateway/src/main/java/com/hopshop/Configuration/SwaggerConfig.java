package com.hopshop.Configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rohith on 23/11/17.
 */
@Primary
@Component
@EnableAutoConfiguration
public class SwaggerConfig implements SwaggerResourcesProvider{

    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList();
        resources.add(swaggerResource("mse-product", "/mse-product/v2/api-docs", "2.0"));
        resources.add(swaggerResource("mse-customer", "/mse-customer/v2/api-docs", "2.0"));
        resources.add(swaggerResource("mse-cart", "/mse-cart/v2/api-docs", "2.0"));
        resources.add(swaggerResource("mse-order", "/mse-order/v2/api-docs", "2.0"));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }


}
