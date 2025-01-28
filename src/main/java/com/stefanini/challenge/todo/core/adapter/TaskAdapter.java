package com.stefanini.challenge.todo.core.adapter;

import com.stefanini.challenge.todo.core.domain.Task;

import java.util.List;

public interface TaskAdapter {

    Task create(Task newTask);

    List<Task> list();

    Task edit(Task toEditTask);

    void delete(Task toDeleteTask);
}
