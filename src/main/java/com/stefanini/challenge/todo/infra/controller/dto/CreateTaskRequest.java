package com.stefanini.challenge.todo.infra.controller.dto;

public record CreateTaskRequest(
        String title,
        String description) {
}
