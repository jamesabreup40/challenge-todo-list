package com.stefanini.challenge.todo.core.usecase;

import com.stefanini.challenge.todo.core.adapter.TaskAdapter;
import com.stefanini.challenge.todo.core.domain.Task;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EditTaskUseCase {
    private final TaskAdapter taskAdapter;

    Task edit(Task toEditTask) {
        return taskAdapter.edit(toEditTask);
    }

}
