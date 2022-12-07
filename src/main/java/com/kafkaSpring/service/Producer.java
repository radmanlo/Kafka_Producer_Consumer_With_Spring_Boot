package com.kafkaSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    //Kafka topic which we want to write the message
    private static final String TOPIC = "java_topic";

    //kafka template for sending messages
    @Autowired
    private KafkaTemplate<String,String> kafkaTemp;

   public void sendMessage(String message){
       System.out.println("Message is sending to Topic: " + TOPIC);
       this.kafkaTemp.send(TOPIC,message);
   }

}
