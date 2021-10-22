package com.example.demo.microservicea.controller;

import com.example.demo.microservicea.feignClient.IBClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {

    private IBClient ibClient;

    private static final Logger log = LoggerFactory.getLogger(AController.class);

    public AController(IBClient ibClient){
        this.ibClient = ibClient;
    }

    @GetMapping("/get-message/a")
    public String getMessage(){

        log.info("Request to get message from A");

        String messageA = "Hello from A";
        String messageB = ibClient.getMessage();

        return "Message from A -> " + messageA + " ::: " + messageB;

    }

}
