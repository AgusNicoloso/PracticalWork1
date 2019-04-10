create database vikingosespartanos;
use vikingosespartanos;
create table ganadores(
  id_ganador int auto_increment,
  nombre_ganador varchar(50),
  bebida_en_cuerpo int,
  constraint pk_usuario primary key(id_ganador)
);
