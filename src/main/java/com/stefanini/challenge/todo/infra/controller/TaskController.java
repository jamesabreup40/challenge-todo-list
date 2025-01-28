package com.stefanini.challenge.todo.infra.controller;

import com.stefanini.challenge.todo.core.usecase.CreateTaskUseCase;
import com.stefanini.challenge.todo.infra.adapter.TaskMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("tasks")
@RequiredArgsConstructor
public class TaskController {
    private final CreateTaskUseCase createTaskUseCase;

    @PostMapping
    @ResponseStatus(OK)
    public CreateTaskResponse createTask(@RequestBody CreateTaskRequest createTaskRequest) {
        return TaskMapper.INSTANCE.createdDomainToResponse(
                createTaskUseCase.create(
                        TaskMapper.INSTANCE.createRequestToDomain(createTaskRequest)
                )
        );
    }

}
