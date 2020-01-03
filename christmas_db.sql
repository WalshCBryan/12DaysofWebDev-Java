

USE christmas_db;
DROP TABLE IF EXISTS people;

CREATE TABLE IF NOT EXISTS
    people (
               id int(10) unsigned NOT NULL AUTO_INCREMENT,
               first_name varchar(50) NOT NULL,
               last_name varchar(50) NOT NULL,
               age int UNSIGNED DEFAULT NULL,
               birthday varchar(50) NOT NULL,
               nice tinyint NOT NULL,
               PRIMARY KEY (id)
);

use christmas_db;

truncate people;

INSERT INTO people (first_name, last_name, age, birthday, nice)
VALUES ('Michael','Angelo',32,'02/25/1987',true);

INSERT INTO people (first_name, last_name, age, birthday, nice)
VALUES ('Donna','Tello',28,'05/30/1991',true);

INSERT INTO people (first_name, last_name, age, birthday, nice)
VALUES ('Leo','Nardo',34,'02/17/1985',false);

INSERT INTO people (first_name, last_name, age, birthday, nice)
VALUES ('Raph','Fayel',25,'10/01/1995',true);

# lets delete all the not-nice ones!
DELETE FROM people where nice = false;

