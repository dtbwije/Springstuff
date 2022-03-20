package org.java.spring.hplusapp.controllers;

import org.java.spring.hplusapp.beans.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.jws.WebParam;

@Controller
public class UserProfileController {

    @PostMapping("/userprofile")
    public String getUserProfile(@SessionAttribute("login") Login login, Model model) {
        System.out.println("in user profile");
        System.out.println("username"+ login.getUsername());
        model.addAttribute("username", login.getUsername());
        return "profile";
    }
}
