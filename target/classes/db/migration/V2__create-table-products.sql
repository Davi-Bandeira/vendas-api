create table products(
    id serial,
    name varchar(50) not null,
    price numeric(7,2) not null,
    primary key(id)
);