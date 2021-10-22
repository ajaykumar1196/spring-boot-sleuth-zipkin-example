package com.example.demo.microservicec.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CController {

    private static final Logger log = LoggerFactory.getLogger(CController.class);


    @GetMapping("/get-message/c")
    public String getMessage(){

        log.info("Request to get message from C");

        String messageC = "Hello from C";

        return "Message from C -> " + messageC;

    }
    
}
