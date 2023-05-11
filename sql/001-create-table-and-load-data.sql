DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL,
  age int NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO users (id, name, age) VALUES (1, "tanaka", 25);
INSERT INTO users (id, name, age) VALUES (2, "suzuki", 30);
INSERT INTO users (id, name, age) VALUES (3, "yamada", 35);
