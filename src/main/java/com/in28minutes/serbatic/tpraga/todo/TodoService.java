package com.in28minutes.serbatic.tpraga.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todosCount = 0;
    // Calls ++todosCount to add to todosCount var and set the id of the todo
    static {
        todos.add(new Todo(++todosCount, "john", "learn aws"
                , LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "john", "learn devOps"
                , LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todosCount, "john", "learn golang"
                , LocalDate.now().plusYears(3), false));
    }

    public static List<Todo> findByUsername(String username) {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done){
        Todo todo = new Todo(++todosCount, username, description, targetDate, done);
        todos.add(todo);
    }

    public void deleteById(int id){
        Predicate<? super Todo> predicate = todo ->todo.getId() == id;
        todos.removeIf(predicate);
    }
}
