package pub_sub_example.kafka_project.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pub_sub_example.kafka_project.domain.News;
import pub_sub_example.kafka_project.service.ProducerService;

@RestController
@RequestMapping("/kafka/v1/producer")
public class ProducerController {
    private final ProducerService producerService;

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void publish(@RequestBody News news) throws JsonProcessingException {
        this.producerService.sendMessage(news);
    }
}
