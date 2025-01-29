package com.stefanini.challenge.todo.core.usecase;

import com.stefanini.challenge.todo.core.adapter.TaskAdapter;
import com.stefanini.challenge.todo.core.domain.Task;
import com.stefanini.challenge.todo.core.usecase.exception.TaskNotFoundException;
import lombok.RequiredArgsConstructor;

import java.util.NoSuchElementException;
import java.util.UUID;

import static java.lang.String.format;

@RequiredArgsConstructor
public class EditTaskUseCase {
    private final TaskAdapter taskAdapter;

    public Task edit(UUID taskId, Task taskToEdit) throws TaskNotFoundException {
        try {
            return taskAdapter.edit(taskId, taskToEdit);
        } catch (NoSuchElementException e) {
            throw new TaskNotFoundException(format("Task id %s is not found", taskId));
        }
    }

}
