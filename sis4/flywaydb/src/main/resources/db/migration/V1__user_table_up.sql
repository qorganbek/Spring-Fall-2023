create table "user" (
    id serial primary key,
    username varchar(100),
    first_name varchar(50),
    last_name varchar(50),
    password varchar(255),
    date_of_birth timestamp
)