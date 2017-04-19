create table smartphones(
id integer not null primary key generated always as identity(start with 1, increment by 1),
name varchar(80) not null,
description varchar (300) not null,
image varchar(300) not null,
value decimal 10,2
)
