package com.zwippetech.kafka;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "canal", groupId = "Equipo")
    void listener(String data) {
        System.out.println(data);
    }

}
