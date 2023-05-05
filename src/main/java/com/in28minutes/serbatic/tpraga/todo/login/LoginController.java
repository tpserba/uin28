package com.in28minutes.serbatic.tpraga.todo.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String welcome(@RequestParam String name
                          ,@RequestParam String password,
                          ModelMap model
                          ){
        model.put("name", name);
        model.put("password", password);
        return "welcome";
    }
}
