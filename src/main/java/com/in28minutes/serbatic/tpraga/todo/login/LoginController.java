package com.in28minutes.serbatic.tpraga.todo.login;

import com.in28minutes.serbatic.tpraga.todo.AuthenticationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private AuthenticationService authenticationService;

@Autowired
    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String welcome(@RequestParam String name
                          ,@RequestParam String password,
                          ModelMap model){
        if(authenticationService.authenticate(name, password)){
            model.put("name", name);
            model.put("password", password);
            return "welcome";
        }
        model.put("errorMsg", "Invalid Credentials. Please try again.");
        return "login";
    }
}
