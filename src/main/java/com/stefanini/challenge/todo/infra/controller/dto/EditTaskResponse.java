package com.stefanini.challenge.todo.infra.controller.dto;

public record EditTaskResponse(
        String title,
        String description,
        String status
) {
}
