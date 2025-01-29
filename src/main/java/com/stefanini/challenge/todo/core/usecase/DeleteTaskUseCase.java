package com.stefanini.challenge.todo.core.usecase;

import com.stefanini.challenge.todo.core.adapter.TaskAdapter;
import com.stefanini.challenge.todo.core.domain.Task;
import com.stefanini.challenge.todo.core.usecase.exception.TaskNotFoundException;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

import static java.lang.String.format;

@RequiredArgsConstructor
public class DeleteTaskUseCase {
    private final TaskAdapter taskAdapter;

    public void delete(UUID taskId) throws TaskNotFoundException {
        try {
            taskAdapter.delete(taskId);
        } catch (NoSuchElementException e) {
            throw new TaskNotFoundException(format("Task id %s is not found", taskId));
        }
    }

}
