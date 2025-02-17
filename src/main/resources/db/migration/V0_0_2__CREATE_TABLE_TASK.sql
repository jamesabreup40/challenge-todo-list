USE todo;
GO
DROP TABLE IF EXISTS TASKS;
GO
CREATE TABLE TASKS (
    ID INT IDENTITY(1, 1),
    TITLE VARCHAR(50) NOT NULL,
    DESCRIPTION VARCHAR(100) NOT NULL,
    CREATED_DATE DATETIME DEFAULT CURRENT_TIMESTAMP,
    STATUS VARCHAR(20) NOT NULL,
);