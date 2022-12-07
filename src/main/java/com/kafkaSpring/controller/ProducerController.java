package com.kafkaSpring.controller;

import com.kafkaSpring.service.Consumer;
import com.kafkaSpring.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    @Autowired
    private Producer producer;

    @Autowired
    private Consumer consumer;

    @PostMapping("/sendMessage")
    public String sendMessage(@RequestParam("message") String message){
        producer.sendMessage(message);
        return message;
    }
}
