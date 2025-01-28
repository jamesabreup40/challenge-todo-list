package com.stefanini.challenge.todo.infra.adapter;

import com.stefanini.challenge.todo.core.adapter.TaskAdapter;
import com.stefanini.challenge.todo.core.domain.Task;
import com.stefanini.challenge.todo.infra.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TaskAdapterGateway implements TaskAdapter {
    private final TaskRepository taskRepository;

    @Override
    public Task create(Task newDomainTask) {
        return TaskMapper.INSTANCE.toDomain(
                taskRepository.save(
                        TaskMapper.INSTANCE.toEntity(newDomainTask)
                )
        );
    }

    @Override
    public List<Task> list() {
        return List.of();
    }

    @Override
    public Task edit(Task domainTaskToEdit) {
        return null;
    }

    @Override
    public void delete(Task domainTaskToDelete) {

    }
}
