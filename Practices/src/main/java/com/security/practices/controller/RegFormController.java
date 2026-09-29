package com.security.practices.controller;

import com.security.practices.entities.RegFormEntity;
import com.security.practices.services.RegFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class RegFormController {

    @Autowired
    private RegFormService regFormService;

    // SignUp Page

    @GetMapping("/api/signup")
    public String openSignup() {
        return "forward:/sign-up_page.html";
    }

    @PostMapping("/submit/regForm")
    public ResponseEntity<String> finallySubmitRegForm(@ModelAttribute RegFormEntity regFormEntity) {
        boolean submit = this.regFormService.addRegoForm(regFormEntity);
        if (!submit) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Sign Up Form Failed!");
        }
        return ResponseEntity.status(HttpStatus.OK).body("Sign Up Form Submitted!");
    }
}
