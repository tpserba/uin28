package com.in28minutes.serbatic.tpraga.todo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


// Handles web requests, so @Controller is added
@Controller
public class SayHelloController {
    /*
    @ResponseBody will send response "as is" to the browser.
    Otherwise it expects a view, and since there's none (for now) an error is thrown.
     */
    @RequestMapping("hello")
    @ResponseBody
    public String sayHello(){
        return "Hello world!";
    }
}
