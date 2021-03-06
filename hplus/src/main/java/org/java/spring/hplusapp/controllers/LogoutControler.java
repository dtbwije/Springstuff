package org.java.spring.hplusapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LogoutControler {
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        System.out.println("Ending the user session");
        session.invalidate();
        //System.out.println(session.getAttribute("login"));
        return "login";
    }

}
