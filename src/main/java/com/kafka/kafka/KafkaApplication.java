package com.kafka.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class KafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}

	@KafkaListener(topics = "test", groupId = "group-id")
	public void listen(String message) {
		System.out.println("Received message: " + message);
	}
}
