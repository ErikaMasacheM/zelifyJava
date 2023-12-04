package com.zwippetech.kafka;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "canal", groupId = "Equipo")
    void listener(String data) {
        for (int i = 0; i < 50; i++) {
            
            System.out.println("Listener recibe: " + i + " :) ");
        }
    }

}
