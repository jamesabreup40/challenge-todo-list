package com.stefanini.challenge.todo.infra.controller;

import com.stefanini.challenge.todo.core.usecase.CreateTaskUseCase;
import com.stefanini.challenge.todo.core.usecase.DeleteTaskUseCase;
import com.stefanini.challenge.todo.core.usecase.EditTaskUseCase;
import com.stefanini.challenge.todo.core.usecase.exception.TaskNotFoundException;
import com.stefanini.challenge.todo.infra.controller.dto.CreateTaskRequest;
import com.stefanini.challenge.todo.infra.controller.dto.CreateTaskResponse;
import com.stefanini.challenge.todo.infra.controller.dto.EditTaskRequest;
import com.stefanini.challenge.todo.infra.controller.dto.EditTaskResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import static com.stefanini.challenge.todo.infra.adapter.TaskMapper.TASK_MAPPER;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("tasks")
@RequiredArgsConstructor
public class TaskController {
    private final CreateTaskUseCase createTaskUseCase;
    private final EditTaskUseCase editTaskUseCase;
    private final DeleteTaskUseCase deleteTaskUseCase;

    @PostMapping
    public ResponseEntity<CreateTaskResponse> createTask(@RequestBody CreateTaskRequest createTaskRequest) {
        return status(CREATED).body(
                TASK_MAPPER.createdDomainToResponse(
                        createTaskUseCase.create(
                                TASK_MAPPER.createRequestToDomain(createTaskRequest)
                        ))
        );
    }

    @PutMapping("/{taskId}")
    public ResponseEntity<EditTaskResponse> editTask(@PathVariable UUID taskId, @RequestBody EditTaskRequest editTaskRequest) {
        try {
            return status(OK).body(TASK_MAPPER.editDomainToResponse(
                    editTaskUseCase.edit(
                            taskId,
                            TASK_MAPPER.editRequestToDomain(editTaskRequest)
                    )
            ));
        } catch (TaskNotFoundException e) {
            return status(NOT_FOUND).build();
        }
    }

}
