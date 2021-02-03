package action.kafka.kafka.controller;

import action.kafka.kafka.dto.MessageDto;
import action.kafka.kafka.service.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/kafka")
@RequiredArgsConstructor
public class KafkaController {
    private final KafkaProducer producer;

    @PostMapping("")
    public ResponseEntity<String> sendMessage(@RequestBody MessageDto message) {
        this.producer.sendMessage(message.getMessage());
        return new ResponseEntity<>(message.getMessage(), HttpStatus.OK);
    }

}
