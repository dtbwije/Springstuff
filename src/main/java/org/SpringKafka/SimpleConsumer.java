package org.SpringKafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class SimpleConsumer {

    @KafkaListener(topics = "demo_topic", groupId = "my-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}