package com.stefanini.challenge.todo.infra.controller;

import com.stefanini.challenge.todo.core.domain.Status;

import java.time.ZonedDateTime;

public record CreateTaskResponse(String title,
                                 String description,
                                 ZonedDateTime createdAt,
                                 Status status) {
}
