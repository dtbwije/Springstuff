package org.SpringKafka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApplication {

    @GetMapping("/create")
    public String createKafkaStream(){
        return "Hello World";
    }
}
