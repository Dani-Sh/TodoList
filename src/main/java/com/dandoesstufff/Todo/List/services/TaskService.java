package com.dandoesstufff.Todo.List.services;

import com.dandoesstufff.Todo.List.models.Task;
import com.dandoesstufff.Todo.List.repos.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Iterable<Task> get() {
        return taskRepository.findAll();
    }
    public Task get(Long id) {
        return taskRepository.findById(id).orElse(null);
    }
    public void delete(Long id) {
        taskRepository.deleteById(id);
    }

    public Task create(String contents) {
        Task task = new Task();
        task.setContents(contents);
        taskRepository.save(task);
        return task;
    }
}
