package action.kafka.kafka.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducer {
    private static final String TOPIC = "reservation";
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg) {
        System.out.printf("Produce message: %s%n", msg);
        this.kafkaTemplate.send(TOPIC, msg);
    }
}
