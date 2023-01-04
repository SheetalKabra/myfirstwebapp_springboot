package com.sampleapp.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    //to get the static list of todos
    private static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo(1, "in28Minutes", "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "in28Minutes", "Learn Devops", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(3, "in28Minutes", "Learn Full Stack Developer", LocalDate.now().plusYears(3), false));
        todos.add(new Todo(4, "in28Minutes", "Learn Spring Boot", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(5, "in28Minutes", "Learn DSA", LocalDate.now().plusYears(1), false));
    }
    public List<Todo> findByUsername(String username){
        return todos;
    }
}
