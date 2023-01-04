package com.sampleapp.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {


    public boolean autheticate(String username, String password){
        boolean isValidUsername = username.equalsIgnoreCase("sheetal");
        boolean isValidPassword = password.equalsIgnoreCase("dummy");
        return isValidUsername && isValidPassword;
    }
}
