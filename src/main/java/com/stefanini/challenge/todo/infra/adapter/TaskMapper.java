package com.stefanini.challenge.todo.infra.adapter;

import com.stefanini.challenge.todo.core.domain.Task;
import com.stefanini.challenge.todo.infra.controller.CreateTaskRequest;
import com.stefanini.challenge.todo.infra.controller.CreateTaskResponse;
import com.stefanini.challenge.todo.infra.repository.TaskEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TaskMapper {

    TaskMapper INSTANCE = Mappers.getMapper( TaskMapper.class );

    Task toDomain(TaskEntity taskEntity);

    TaskEntity toEntity(Task domainTask);

    Task createRequestToDomain(CreateTaskRequest createTaskRequest);

    CreateTaskResponse createdDomainToResponse(Task createdDomainTask);
}
