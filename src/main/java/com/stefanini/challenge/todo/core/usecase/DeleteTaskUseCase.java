package com.stefanini.challenge.todo.core.usecase;

import com.stefanini.challenge.todo.core.adapter.TaskAdapter;
import com.stefanini.challenge.todo.core.domain.Task;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class DeleteTaskUseCase {
    private final TaskAdapter taskAdapter;

    void delete(Task toDeleteTask) {
        taskAdapter.delete(toDeleteTask);
    }

}
