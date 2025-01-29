package com.stefanini.challenge.todo.infra.config;

import com.stefanini.challenge.todo.core.usecase.CreateTaskUseCase;
import com.stefanini.challenge.todo.core.usecase.EditTaskUseCase;
import com.stefanini.challenge.todo.infra.adapter.TaskAdapterGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class IocConfig {
    private final TaskAdapterGateway taskAdapterGateway;

    @Bean
    public CreateTaskUseCase createTaskUseCase() {
        return new CreateTaskUseCase(taskAdapterGateway);
    }

    @Bean
    public EditTaskUseCase editTaskUseCase() {
        return new EditTaskUseCase(taskAdapterGateway);
    }

}
