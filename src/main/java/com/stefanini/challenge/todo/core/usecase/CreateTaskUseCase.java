package com.stefanini.challenge.todo.core.usecase;

import com.stefanini.challenge.todo.core.adapter.TaskAdapter;
import com.stefanini.challenge.todo.core.domain.Task;
import lombok.RequiredArgsConstructor;

import static com.stefanini.challenge.todo.core.domain.TaskStatus.PENDING;
import static java.time.LocalDateTime.now;
import static java.util.UUID.randomUUID;

@RequiredArgsConstructor
public class CreateTaskUseCase {
    private final TaskAdapter taskAdapter;

    public Task create(Task newTask) {
        newTask.setTaskId(randomUUID());
        newTask.setCreatedAt(now());
        newTask.setStatus(PENDING);
        return taskAdapter.create(newTask);
    }

}
