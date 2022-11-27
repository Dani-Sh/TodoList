package com.dandoesstufff.Todo.List.controllers;

import com.dandoesstufff.Todo.List.models.Task;
import com.dandoesstufff.Todo.List.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ToDoController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/Tasks")
    public Iterable<Task> get(){
        return taskService.get();
    }
    @GetMapping("/Tasks/{id}")
    public Task get(@PathVariable Long id) {
        return taskService.get(id);
    }
    @DeleteMapping("/Tasks/{id}")
    public void delete(@PathVariable Long id) {
        taskService.delete(id);
    }
    @PostMapping("/Tasks")
    public Task create(@RequestBody String contents) {
        return taskService.create(contents);
    }
}
