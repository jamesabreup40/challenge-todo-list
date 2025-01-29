package com.stefanini.challenge.todo.core.usecase;

import com.stefanini.challenge.todo.core.adapter.TaskAdapter;
import com.stefanini.challenge.todo.core.domain.Task;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ListTaskUseCase {
    private final TaskAdapter taskAdapter;

    public List<Task> list() {
        return taskAdapter.list();
    }

}
