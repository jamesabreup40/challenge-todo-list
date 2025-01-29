package com.stefanini.challenge.todo.infra.repository;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table("TASKS")
public record TaskEntity(
        @Id @Column("ID") Long id,
        @Column("TITLE") String title,
        @Column("DESCRIPTION") String description,
        @Column("CREATED_DATE") LocalDateTime createdAt,
        @Column("STATUS") String status
) {
}
