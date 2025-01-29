package com.stefanini.challenge.todo.infra.repository;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Table("TASKS")
@AllArgsConstructor
@Data
public class TaskEntity {

    @Id
    @Column("ID")
    private Long id;
    @Column("TASK_ID")
    private UUID taskId;
    @Column("TITLE")
    private String title;
    @Column("DESCRIPTION")
    private String description;
    @Column("CREATED_DATE")
    private LocalDateTime createdAt;
    @Column("STATUS")
    private String status;

}
