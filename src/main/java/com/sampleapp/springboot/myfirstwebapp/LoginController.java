package com.sampleapp.springboot.myfirstwebapp;

import com.sampleapp.springboot.myfirstwebapp.login.AuthenticationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value="login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value="login", method = RequestMethod.POST)
    public String welcome(@RequestParam String name, @RequestParam String password, ModelMap model){
        if(authenticationService.autheticate(name, password)){
            model.put("name", name);
            model.put("password", password);
            //add simple Authentication here - lets create a separate class which is responsible for Authentication only
            //if name = Sheetal, and password = dummy, then only user can enter into Welcome page
            return "welcome";
        }
        model.put("errorMessage", "Invalid Credentials!");
        return "login";
    }
}
