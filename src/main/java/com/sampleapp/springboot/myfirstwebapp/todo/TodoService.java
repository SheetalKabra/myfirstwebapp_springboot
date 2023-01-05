package com.sampleapp.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    //to get the static list of todos
    private static List<Todo> todos = new ArrayList<>();
    private static int todoCount = 0;
    static {
        todos.add(new Todo(++todoCount, "in28Minutes", "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todoCount, "in28Minutes", "Learn Devops", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todoCount, "in28Minutes", "Learn Full Stack Developer", LocalDate.now().plusYears(3), false));
        todos.add(new Todo(++todoCount, "in28Minutes", "Learn Spring Boot", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todoCount, "in28Minutes", "Learn DSA", LocalDate.now().plusYears(1), false));
    }
    public List<Todo> findByUsername(String username){
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, Boolean done){
        todos.add(new Todo(++todoCount, username, description, targetDate, done));
    }

    public void deleteById(int id){
        //use lambda function here
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }
}
