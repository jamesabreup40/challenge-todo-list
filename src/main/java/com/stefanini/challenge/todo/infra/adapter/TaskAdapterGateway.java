package com.stefanini.challenge.todo.infra.adapter;

import com.stefanini.challenge.todo.core.adapter.TaskAdapter;
import com.stefanini.challenge.todo.core.domain.Task;
import com.stefanini.challenge.todo.infra.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static com.stefanini.challenge.todo.infra.adapter.TaskMapper.TASK_MAPPER;
import static java.util.stream.StreamSupport.stream;

@Component
@RequiredArgsConstructor
public class TaskAdapterGateway implements TaskAdapter {
    private final TaskRepository taskRepository;

    @Override
    public Task create(Task newDomainTask) {
        return TASK_MAPPER.toDomain(
                taskRepository.save(
                        TASK_MAPPER.toEntity(newDomainTask)
                )
        );
    }

    @Override
    public List<Task> list() {
        return stream(taskRepository.findAll().spliterator(), false)
                .map(TASK_MAPPER::toDomain).toList();
    }

    @Override
    public Task edit(UUID taskId, Task taskToEdit) {
        return taskRepository.findByTaskId(taskId)
                .map(actualTaskEntity -> {
                    actualTaskEntity.setTitle(taskToEdit.getTitle());
                    actualTaskEntity.setDescription(taskToEdit.getDescription());
                    actualTaskEntity.setStatus(taskToEdit.getStatus().name());
                    taskRepository.save(actualTaskEntity);
                    return TASK_MAPPER.toDomain(actualTaskEntity);
                })
                .orElseThrow();
    }

    @Override
    public void delete(UUID taskId) {
        var actualTaskEntity = taskRepository.findByTaskId(taskId).orElseThrow();
        taskRepository.delete(actualTaskEntity);
    }
}
