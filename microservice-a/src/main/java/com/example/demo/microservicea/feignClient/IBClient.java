package com.example.demo.microservicea.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("MServiceB")
public interface IBClient {

    @RequestMapping("/get-message/b")
    public String getMessage();
}
