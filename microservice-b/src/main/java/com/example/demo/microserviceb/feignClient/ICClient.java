package com.example.demo.microserviceb.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("MServiceC")
public interface ICClient {

    @RequestMapping("/get-message/c")
    public String getMessage();
}
