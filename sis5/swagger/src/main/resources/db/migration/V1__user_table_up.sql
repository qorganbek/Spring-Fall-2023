create table if not exists "user" (
    id serial primary key,
    username varchar(50),
    first_name varchar(50),
    last_name varchar(50),
    password varchar(255),
    day_of_birth timestamp
)