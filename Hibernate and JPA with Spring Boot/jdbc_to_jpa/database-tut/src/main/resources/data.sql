--create table person
--(
--    id integer not null,
--    name varchar(255) not null,
--    location varchar(255),
--    birth_date timestamp,
--    primary key(id)
--);

INSERT INTO PERSON
(ID,NAME,LOCATION,BIRTH_DATE)
--VALUES(10001,'Ranga','Hyderabad',CURRENT_DATE);
VALUES
    (10001, 'Ranga', 'Hyderabad', CURRENT_DATE),
    (10002, 'John', 'New York', CURRENT_DATE),
    (10003, 'Alice', 'London', CURRENT_DATE),
    (10004, 'Bob', 'Tokyo', CURRENT_DATE),
    (10005, 'Emma', 'Paris', CURRENT_DATE);