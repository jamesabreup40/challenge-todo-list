package com.stefanini.challenge.todo.infra.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface TaskRepository extends CrudRepository<TaskEntity, Long> {

    Optional<TaskEntity> findByTaskId(UUID taskId);
}
