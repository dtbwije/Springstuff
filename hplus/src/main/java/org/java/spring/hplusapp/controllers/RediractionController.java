package org.java.spring.hplusapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RediractionController {

    @GetMapping("/redirectToLinkdedIn")
    public String redirectOut(){
        System.out.println("redirection page");
        return "redirect:http://www.linkedin.com";
    }
}
