package org.java.spring.hplusapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String goHome() {
        System.out.println("In home controller");
        return "index";
    }

    @GetMapping("/goToSearch")
    public String goToSearch() {
        System.out.println(" going to search page.");
        return "search";
    }

    @GetMapping("/goToLogin")
    public String goToLogin() {
        System.out.println("In home controller");
        return "login";
    }

    @GetMapping("/goToRegistration")
    public String goToRegistration() {
        System.out.println(" going to search page.");
        return "register";
    }

}
