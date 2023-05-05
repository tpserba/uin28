package com.in28minutes.serbatic.tpraga.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {
    private static List<Todo> todos;
    static {
        todos.add(new Todo(1, "john", "learn aws"
                , LocalDate.now().plusYears(1), false));
        todos.add(new Todo(1, "john", "learn devOps"
                , LocalDate.now().plusYears(2), false));
        todos.add(new Todo(1, "john", "learn golang"
                , LocalDate.now().plusYears(3), false));
    }

    public static List<Todo> findByUsername(String username) {
        return todos;
    }
}
