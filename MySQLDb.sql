USE adlister_db;
DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;

CREATE DATABASE IF NOT EXISTS adlister_db;

use adlister_db;

CREATE TABLE users(
    id INT UNSIGNED not null AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    password VARCHAR(50) not null,
    primary key(id)

);

-- # CREATE TABLE categories(
-- #     category_id INT UNSIGNED not null AUTO_INCREMENT,
-- #     category_name VARCHAR (100),
-- #     primary key(category_id),
-- #     UNIQUE KEY 'category_name'('category_name')
-- # );

CREATE TABLE ads(
    ad_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    title VARCHAR (50) NOT NULL,
    description TEXT NOT NULL,
    primary key(ad_id),
    FOREIGN KEY (user_id) REFERENCES users (id)
        ON DELETE CASCADE

);
-- INSERT INTO users(user_id, user_name, email, password )
--     VALUES (1, 'nicko',  'nicko@codeup.com', 'password' );

