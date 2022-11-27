package com.dandoesstufff.Todo.List.repos;

import com.dandoesstufff.Todo.List.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long>{}