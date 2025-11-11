CREATE TABLE users (
    id serial not null PRIMARY KEY,
    username VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    enabled BOOLEAN NOT NULL DEFAULT TRUE,
    roles VARCHAR(20) NOT NULL
);