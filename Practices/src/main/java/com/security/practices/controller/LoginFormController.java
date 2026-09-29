package com.security.practices.controller;

import com.security.practices.entities.LoginPageEntity;
import com.security.practices.services.LoginFormServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class LoginFormController {

    @Autowired
    private LoginFormServices loginFormServices;

    // Login Page

    @GetMapping("/api/login")
    public String openLogin() {
        return "forward:/log-in_page.html";
    }

    @PostMapping("/submit/loginForm")
    public ResponseEntity<String> finallySubmitLoginForm(@ModelAttribute LoginPageEntity loginPageEntity) {
        boolean submit = this.loginFormServices.addLoginForm(loginPageEntity);

        if (!submit) {
            throw new ResponseStatusException(HttpStatus
                    .INTERNAL_SERVER_ERROR,
                    "Login Form Failed!!");
        }
        return ResponseEntity.ok("Login Page Submitted!!");
    }
}
