package com.stefanini.challenge.todo.core.domain;

import java.time.ZonedDateTime;

public record Task(
        String title,
        String description,
        ZonedDateTime createdAt,
        Status status) {
}