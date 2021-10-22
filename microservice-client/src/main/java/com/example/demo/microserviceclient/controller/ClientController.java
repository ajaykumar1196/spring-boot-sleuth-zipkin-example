package com.example.demo.microserviceclient.controller;

import com.example.demo.microserviceclient.feignClient.IAClient;
import com.example.demo.microserviceclient.feignClient.IBClient;
import com.example.demo.microserviceclient.feignClient.ICClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClientController {

    private IAClient iaClient;
    private IBClient ibClient;
    private ICClient icClient;

    private static final Logger log = LoggerFactory.getLogger(ClientController.class);


    public ClientController(IAClient iaClient, IBClient ibClient, ICClient icClient){
        this.iaClient = iaClient;
        this.ibClient = ibClient;
        this.icClient = icClient;
    }

    @GetMapping("/get-message")
    public String getMessage(){

        log.info("Request to get message from Client");

        return iaClient.getMessage();
    }

    @GetMapping("/get-message/abc")
    public List<String> getMessageABC(){

        log.info("Request to get list of message from Client");

        List<String> messages = new ArrayList<>();
        messages.add(iaClient.getMessage());
        messages.add(ibClient.getMessage());
        messages.add(icClient.getMessage());
        return messages;
    }
    
}
