# challenge-todo-list

challenge-todo-list is a system that manages a TODO list.

### Execution How-To

```bash
# gradle app start
$ ./gradlew bootRun

# The server will start on HTTP port 8080
```

### Tests How-To

```bash
# Create a Task
$ curl --location 'http://localhost:8080/tasks' \
--header 'Content-Type: application/json' \
--data '{
    "title":"Task title",
    "description":"Task definition"
}'

# Update a founded Task
$ curl --location --request PUT 'http://localhost:8080/tasks/{taskId}' \
--header 'Content-Type: application/json' \
--data '{
    "title":"New Task Title",
    "description":"New Task definition",
    "status": "PENDING|IN_PROGRESS|COMPLETED"
}'

# Delete a Task
$ curl --location --request DELETE 'http://localhost:8080/tasks/{taskId}'

# List All Tasks
$ curl --location 'http://localhost:8080/tasks'

```


