package org.java.spring.hplusapp.controllers;

import org.java.spring.hplusapp.beans.Login;
import org.java.spring.hplusapp.beans.User;
import org.java.spring.hplusapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.registerCustomEditor(Date.class,new CustomDateEditor( new SimpleDateFormat("yyyy-MM-dd"),true));
    }



    /*
    Binding result has to be placed right after the @Modelattribute.
     */
    @PostMapping("/registeruser")
    public String registerUser(@Valid @ModelAttribute("newuser")User user, BindingResult bindingResult,Model model){
        System.out.println("In registration controller");
        System.out.println(user.getDateOfBirth());
        if(bindingResult.hasErrors()){
            return "register";
        }
        userRepository.save(user);
        model.addAttribute("dataSaved", "User saved successfully");
        return "login";
    }

    @ModelAttribute("login")
    public Login getDefaultLogin(){
        return new Login();
    }
}
