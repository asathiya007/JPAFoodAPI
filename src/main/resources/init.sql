USE food_db;

DROP TABLE IF EXISTS food_groups;
CREATE TABLE food_groups(
    name varchar(50) NOT NULL,
    PRIMARY KEY (name)
);

DROP TABLE IF EXISTS foods;
CREATE TABLE foods(
    name varchar(50) NOT NULL,
    tasty boolean NOT NULL,
    healthy boolean NOT NULL,
    food_group varchar(50) NOT NULL
);