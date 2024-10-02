create database pokemon;
use pokemon;

create table pokemon(
	id int auto_increment primary key,
    numeroPokedex int not null,
    nombre varchar(50) not null,
    tipo varchar(50) not null,
    nivel int default 1
);

