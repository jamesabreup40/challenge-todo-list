package com.stefanini.challenge.todo.infra.controller.dto;

public record EditTaskRequest(
        String title,
        String description,
        String status
) {
}
