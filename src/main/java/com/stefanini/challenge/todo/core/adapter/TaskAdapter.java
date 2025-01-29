package com.stefanini.challenge.todo.core.adapter;

import com.stefanini.challenge.todo.core.domain.Task;

import java.util.List;
import java.util.UUID;

public interface TaskAdapter {

    Task create(Task newTask);

    List<Task> list();

    Task edit(UUID taskId, Task taskToEdit);

    void delete(UUID taskIdToDelete);
}
