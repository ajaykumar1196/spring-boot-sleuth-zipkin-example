package com.example.demo.microserviceclient.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("MServiceA")
public interface IAClient {

    @RequestMapping("/get-message/a")
    public String getMessage();
}
