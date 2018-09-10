create database db_Biblioteca;
use db_Biblioteca;

create table USUARIO(
Cod_Usuario int primary key identity(1,1) not null,
Nome varchar(50) not null,
Rg varchar(9) not null,
Nivel varchar(13) not null,
Email varchar(50) not null,
Endereco varchar(100) not null,
Sexo char(1) not null,
DataNasc varchar(13) not null,
Cargo varchar(20) not null,
Documento varchar(20) not null,
Status varchar(7) not null,
Telefone varchar(13) not null
)

create table LOGIN (
Cod_Login int primary key identity(1,1) not null,
Cod_Usuario_Login_Fk int not null,
CONSTRAINT Cod_Usuario_Login_Fk FOREIGN KEY(Cod_Usuario_Login_Fk) REFERENCES USUARIO(Cod_Usuario),
nome_usuario varchar(20) not null,
senha varchar(13) not null
)

create table ITEM(
Cod_Item int primary key identity(1,1) not null,
Cod_Externo varchar(50) not null,
Nome_Item varchar(50) not null,
Editora varchar(50) not null,
Idioma varchar(20) not null,
Genero varchar(20) not null,
Tipo varchar(20) not null
)
create table EMPRESTIMO(
Cod_Emprestimo int primary key identity(1,1) not null,
Cod_Usuario int not null,
CONSTRAINT Cod_Usuario FOREIGN KEY(Cod_Usuario) references USUARIO(Cod_Usuario),
Cod_Item int not null,
Constraint Cod_Item FOREIGN KEY(Cod_Item) references ITEM(Cod_Item),
Data_Emprestimo Date not null,
Data_Prevista_Entrega Date not null,
Entrega_Efetiva bit not null
)

INSERT INTO USUARIO(Nome,Rg,Nivel,Email,Endereco,Sexo,DataNasc,Cargo,Documento,Status,Telefone)
VALUES('ADM','398791119','Administrador','adm@adm.com.br','adm','M','07/01/1999','Administrativo',2020,'Ativo','3713-0131');
INSERT INTO LOGIN(Cod_Usuario_Login_Fk,nome_usuario,senha)
values(1,'adm','adm');