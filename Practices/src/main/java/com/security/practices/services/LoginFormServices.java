package com.security.practices.services;

import com.security.practices.entities.LoginPageEntity;
import com.security.practices.repository.LoginFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginFormServices {

    @Autowired
    private LoginFormRepository loginFormRepository;

    public boolean addLoginForm(LoginPageEntity loginPageEntity) {
        try {
            this.loginFormRepository.save(loginPageEntity);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
