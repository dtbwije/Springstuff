package org.java.spring.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String goHome(){
        System.out.println("In home controller");
        return "index";
    }
}
