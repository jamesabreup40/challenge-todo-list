package com.stefanini.challenge.todo.core.usecase;

import com.stefanini.challenge.todo.core.adapter.TaskAdapter;
import com.stefanini.challenge.todo.core.domain.Task;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
public class DeleteTaskUseCase {
    private final TaskAdapter taskAdapter;

    public void delete(UUID taskIdToDelete) {
        taskAdapter.delete(taskIdToDelete);
    }

}
