package com.in28minutes.serbatic.tpraga.todo.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping("login")
    public String login(@RequestParam String name){
        System.out.println(name);
        return "login";
    }
}
