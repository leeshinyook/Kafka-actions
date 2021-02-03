package action.kafka.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "reservation", groupId = "summer")
    public void consume(String msg) {
        System.out.printf("Consumed message : %s%n", msg);
    }
}
