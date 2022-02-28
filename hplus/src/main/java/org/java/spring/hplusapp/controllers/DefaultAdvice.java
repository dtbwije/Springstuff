package org.java.spring.hplusapp.controllers;

import org.java.spring.hplusapp.beans.Login;
import org.java.spring.hplusapp.beans.User;
import org.java.spring.hplusapp.exceptions.ApplicationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@ControllerAdvice
public class DefaultAdvice {

    @ModelAttribute("newuser")
    public User getDefaultUser() {
        return new User();
    }

    @ModelAttribute("genderItems")
    public List<String> getGenderItems() {
        return Arrays.asList(new String[]{"Male", "Female", "Other"});
    }

    @ModelAttribute("login")
    public Login getDefaultLogin() {
        return new Login();
    }

    @ExceptionHandler(ApplicationException.class)
    public String handleException() {
        System.out.println("in exception handler of Login Controller");
        return "error";
    }
}
