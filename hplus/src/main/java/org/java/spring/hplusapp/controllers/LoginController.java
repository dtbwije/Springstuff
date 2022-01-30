package org.java.spring.hplusapp.controllers;

import org.java.spring.hplusapp.beans.Login;
import org.java.spring.hplusapp.beans.User;
import org.java.spring.hplusapp.exceptions.ApplicationException;
import org.java.spring.hplusapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(@ModelAttribute("login")Login login) throws ApplicationException {
        User user  = userRepository.searchByName(login.getUsername());
        if(user==null){
            throw new ApplicationException("User not found");
        }
        return "login";
    }

}
