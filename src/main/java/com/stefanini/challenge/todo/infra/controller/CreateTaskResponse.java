package com.stefanini.challenge.todo.infra.controller;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record CreateTaskResponse(String title,
                                 String description,
                                 @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                                 LocalDateTime createdAt,
                                 String status) {
}
