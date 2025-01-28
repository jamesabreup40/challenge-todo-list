package com.stefanini.challenge.todo.infra.repository;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.ZonedDateTime;

@Table("tasks")
public class TaskEntity {

    @Id
    private Long id;
    private String title;
    private String description;
    @Column("created_date")
    private ZonedDateTime createdAt;
    private String status;

}
