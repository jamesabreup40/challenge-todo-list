package com.stefanini.challenge.todo.core.usecase;

import com.stefanini.challenge.todo.core.adapter.TaskAdapter;
import com.stefanini.challenge.todo.core.domain.Task;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateTaskUseCase {
    private final TaskAdapter taskAdapter;

    public Task create(Task newTask) {
        return taskAdapter.create(newTask);
    }

}
