package com.in28minutes.serbatic.tpraga.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {
    private TodoService todoService;
    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("list-todos")
    public String listtAllTodos(ModelMap model){
        List<Todo> todos = todoService.findByUsername("john");
        model.addAttribute("todos", todos);
        return "listTodos";
    }
}
