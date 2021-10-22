package com.example.demo.microserviceb.controller;

import com.example.demo.microserviceb.feignClient.ICClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BController {

    private ICClient icClient;

    private static final Logger log = LoggerFactory.getLogger(BController.class);

    public BController(ICClient icClient){
        this.icClient = icClient;
    }

    @GetMapping("/get-message/b")
    public String getMessage(){

        log.info("Request to get message from B");

        String messageB = "Hello from B";
        String messageC = icClient.getMessage();

        return "Message from B -> " + messageB + " ::: " + messageC;
    }

}
