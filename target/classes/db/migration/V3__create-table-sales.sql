create table sales(
    id serial,
    client varchar(50) not null,
    email varchar(50) not null,
    product varchar(50) not null,
    price numeric(7,2) not null,
    primary key(id)
);