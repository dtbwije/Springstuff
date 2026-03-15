package org.SpringKafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApplication {

    //curl -X POST "http://localhost:8080/kafka/send?msg=hello"
    private final SimpleProducer producer;

    @Autowired
    public RestApplication(SimpleProducer producer) {
        this.producer = producer;
    }


    @GetMapping("/create")
    public String createKafkaStream(@RequestParam String msg){
        producer.send(msg);
        return "Sent: "+ msg ;
    }
}
