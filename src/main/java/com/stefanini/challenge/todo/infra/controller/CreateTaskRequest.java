package com.stefanini.challenge.todo.infra.controller;

public record CreateTaskRequest(
        String title,
        String description) {
}
