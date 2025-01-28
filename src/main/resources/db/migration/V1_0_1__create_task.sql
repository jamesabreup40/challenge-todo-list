USE todo;
GO
DROP TABLE IF EXISTS tasks;
GO
CREATE TABLE tasks (
    id INT IDENTITY(1, 1),
    title VARCHAR(50),
    description VARCHAR(255),
    createdAt DATETIME,
    status VARCHAR(20),
);