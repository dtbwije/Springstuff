package org.java.spring.hplusapp.controllers;

import org.java.spring.hplusapp.beans.User;
import org.java.spring.hplusapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    /*
    Binding result has to be placed right after the @Modelattribute.
     */
    @PostMapping("/registeruser")
    public String registerUser(@Valid @ModelAttribute("newuser")User user, BindingResult bindingResult,Model model){
        System.out.println("In registration controller");
        if(bindingResult.hasErrors()){
            return "register";
        }
        userRepository.save(user);
        model.addAttribute("dataSaved", "USer saved successfully");
        return "login";

    }
}
