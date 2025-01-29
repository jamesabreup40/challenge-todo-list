package com.stefanini.challenge.todo.core.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Task {

    private String title;
    private String description;
    private LocalDateTime createdAt;
    private TaskStatus status;

}