package com.kafka.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;

public class KafkaListenerApp {

    @KafkaListener(topics = "test", groupId = "group-id")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
