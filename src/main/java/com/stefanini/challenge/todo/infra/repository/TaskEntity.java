package com.stefanini.challenge.todo.infra.repository;


import org.springframework.data.annotation.Id;

import java.time.ZonedDateTime;

public class TaskEntity {

    @Id
    private Long id;
    private String title;
    private String description;
    private ZonedDateTime createdAt;
    private String status;

}
