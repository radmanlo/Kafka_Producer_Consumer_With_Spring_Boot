package com.kafkaSpring.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "java_topic", groupId = "third_group_consumer")
    public void consumeFromTopic( String message){
        System.out.println("Consumed Message: "+ message);
    }
}
