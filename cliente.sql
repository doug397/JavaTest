
create sequence seq_cliente start 1;

create table cliente(

n_conta int not null 
	default nextval('seq_cliente'),

nome varchar(50),
cpf integer not null,
dataNascimento date,
eEspecial boolean,
	
primary key(n_conta)

);





select *from cliente;

delete from cliente where n_conta=2;


